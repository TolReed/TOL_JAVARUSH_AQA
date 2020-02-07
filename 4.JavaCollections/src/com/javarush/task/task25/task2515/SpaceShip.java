package com.javarush.task.task25.task2515;

/**
 * Класс для космического корабля
 */
public class SpaceShip extends BaseObject {

    //картинка корабля для отрисовки
    private static final int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {1, 0, 1, 0, 1},
            {1, 1, 1, 1, 1},
    };

    //вектор движения (-1 влево,+1 вправо)
    private double dx = 0;

    public SpaceShip(int x, int y) {
        super(x, y, 3);
    }

    /**
     * Устанавливаем вектор движения влево
     */
    public void moveLeft() {
        dx = -1;
    }

    /**
     * Устанавливаем вектор движения вправо
     */
    public void moveRight() {
        dx = 1;
    }

    /**
     * Метод рисует свой объект на "канвасе".
     */
    @Override
    public void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y, matrix, 'M');
    }

    /**
     * Двигаем себя на один ход.
     * Проверяем столкновение с границами.
     */
    @Override
    public void move() {
        x = x + dx;

        checkBorders(radius, com.javarush.test.level25.lesson16.big01.Space.game.getWidth() - radius + 1, 1, com.javarush.test.level25.lesson16.big01.Space.game.getHeight() + 1);
    }

    /**
     * Стреляем.
     * Создаем две ракеты: слева и справа от корабля.
     */
    public void fire() {
        com.javarush.test.level25.lesson16.big01.Space.game.getRockets().add(new Rocket(x - 2, y));
        com.javarush.test.level25.lesson16.big01.Space.game.getRockets().add(new Rocket(x + 2, y));
    }
}