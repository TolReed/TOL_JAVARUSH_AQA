package com.javarush.games.game2048;
import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private boolean isGameStopped = false;
    private int score = 0;

    @Override
    public void initialize(){
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private int[][] gameField = new int[SIDE][SIDE];

    private void createNewNumber(){
        if(getMaxTileValue() == 2048){
            win();
        }
        int x;
        int y;
        do {
            x = getRandomNumber(SIDE);
            y = getRandomNumber(SIDE);
        } while (gameField[y][x] != 0);
        int randomNumber = getRandomNumber(10);
        if (randomNumber == 9) {
            gameField[y][x] = 4;
        } else {
            gameField[y][x] = 2;
        }
    }

    private void drawScene(){
        for(int i = 0; i<SIDE; i++){
            for(int j = 0; j<SIDE; j++){
                setCellColoredNumber(i, j, gameField[j][i]);
            }
        }
    }

    private void createGame(){
        gameField = new int[SIDE][SIDE];
        createNewNumber();
        createNewNumber();
    }

    private void setCellColoredNumber (int x, int y, int value) {
        String valueToString = value == 0 ? "" : String.valueOf(value);
        setCellValueEx(x, y, getColorByValue(value), valueToString);
    }
    private Color getColorByValue(int value){
        switch(value){
            case 2:
                return Color.GOLD;
            case 4:
                return Color.AQUA;
            case 8:
                return Color.BEIGE;
            case 16:
                return Color.AZURE;
            case 32:
                return Color.BURLYWOOD;
            case 64:
                return Color.DARKGREY;
            case 128:
                return Color.FUCHSIA;
            case 256:
                return Color.HONEYDEW;
            case 512:
                return Color.GREEN;
            case 1024:
                return Color.CORAL;
            case 2048:
                return Color.DARKVIOLET;
            default:
                return Color.WHITE;
        }
    }
    private boolean compressRow(int[] row) {
        boolean isChanged = false;
        for (int i = 0; i < row.length-1; i++) {
            if (row[i] == 0 && row[i] != row[i + 1]) {
                isChanged = true;
                row[i] = row[i + 1];
                row[i + 1] = 0;
            }
        }
        if (isChanged) {
            compressRow(row);
        }
        return isChanged;
    }

    private boolean mergeRow(int[] row){
        boolean sumCell = false;
        int emptyNumber = 0;
        for (int i = 0; i<row.length-1; i++){
            if(row[i] == row[i+1] && row[i] != 0 ){
                row[i] = row[i]+row[i+1];
                row[i+1] = emptyNumber;
                score = score + row[i]+row[i+1];
                setScore(score);
                sumCell = true;
            }
        }
        return sumCell;
    }

    public void onKeyPress(Key key){

        if(key == Key.SPACE){
            isGameStopped = false;
            createGame();
            drawScene();
            score = 0;
            setScore(score);
            return;
        }
        if(!isGameStopped){
            if(!canUserMove()){
                gameOver();
                return;
            }
            if(key == Key.LEFT){
                moveLeft();
                drawScene();
            }
            else if(key == Key.RIGHT){
                moveRight();
                drawScene();
            }
            else if(key == Key.UP){
                moveUp();
                drawScene();
            }
            else if(key == Key.DOWN){
                moveDown();
                drawScene();
            }
        }
    }
       

    private void moveLeft(){
        boolean counter = false;
        for (int i = 0; i < SIDE; i++) {
            if (compressRow(gameField[i])) counter = true;
            if (mergeRow(gameField[i])) counter = true;
            if (compressRow(gameField[i])) counter = true;
        }
        if (counter) createNewNumber();
    }
    private void moveRight(){
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }
    private void moveUp(){
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }
    private void moveDown(){
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }
    private void rotateClockwise(){
        int[][] rotateField = new int[SIDE][SIDE];
        for (int i = 0; i < SIDE; i++){
            for (int j = 0; j < SIDE; j++){
                rotateField[i][j] = gameField[gameField.length - j - 1][i];
            }
        }
        gameField = rotateField;
    }

    private int getMaxTileValue(){
        int start = gameField[0][0];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                if (start < gameField[j][i]) {
                    start = gameField[j][i];
                }
            }
        }
        return start;
    }
    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.BLACK, "Win!!!", Color.WHITE, 24);
    }
    private void gameOver(){
        isGameStopped = true;
        showMessageDialog(Color.BLACK, "GameOver!!!", Color.WHITE, 24);
    }
    private boolean canMerge()
    {
        for (int y = 0; y < SIDE; y++)
        {
            for (int x = 0; x < SIDE - 1; x++)
            {
                if (gameField[y][x] == gameField[y][x + 1] && gameField[y][x] != 0)
                    return true;
            }
        }
        for (int x = 0; x < SIDE; x++)
        {
            for (int y = 0; y < SIDE - 1; y++)
            {
                if (gameField[y][x] == gameField[y + 1][x] && gameField[y][x] != 0)
                    return true;
            }
        }
        return false;
    }
    private boolean emptyNumberCell(){
        for(int i = 0; i<SIDE; i++){
            for(int j = 0; j<SIDE; j++){
                if(gameField[i][j] == 0) return true;
            }
        }
        return false;
    }
    private boolean canUserMove()
    {
        if (emptyNumberCell() || canMerge())
            return true;
        else
            return false;
    }
}
