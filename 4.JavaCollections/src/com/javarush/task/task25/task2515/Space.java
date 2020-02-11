package com.javarush.task.task25.task2515;

import java.util.ArrayList;

/**
 * @autor mvl on 25.07.2017.
 */
public class Space {
    private int width, height;
    private SpaceShip ship;


    public ArrayList<Ufo> getUfos() {
        return ufos;
    }

    public void setUfos(ArrayList<Ufo> ufos) {
        this.ufos = ufos;
    }

    public ArrayList<Rocket> getRockets() {
        return rockets;
    }

    public void setRockets(ArrayList<Rocket> rockets) {
        this.rockets = rockets;
    }

    public ArrayList<Bomb> getBombs() {
        return bombs;
    }

    public void setBombs(ArrayList<Bomb> bombs) {
        this.bombs = bombs;
    }

    private ArrayList<Ufo> ufos = new ArrayList<>();
    private ArrayList<Rocket> rockets = new ArrayList<>();
    private ArrayList<Bomb> bombs = new ArrayList<>();

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public SpaceShip getShip() {
        return ship;
    }

    public void setShip(SpaceShip ship) {
        this.ship = ship;
    }

    public Space(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
    }
}