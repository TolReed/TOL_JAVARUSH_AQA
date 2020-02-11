package com.javarush.task.task25.task2515;

import java.util.ArrayList;

/**
 * @autor mvl on 25.07.2017.
 */
public class Space {
    private int width, height;



    //Космический корабль
    private SpaceShip ship;
    //Список НЛО
    private ArrayList<Ufo> ufos = new ArrayList<Ufo>();
    //Список бомб
    private ArrayList<Bomb> bombs = new ArrayList<Bomb>();
    //Список ракет
    private ArrayList<Rocket> rockets = new ArrayList<Rocket>();

    public Space(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public SpaceShip getShip()
    {
        return ship;
    }

    public void setShip(SpaceShip ship)
    {
        this.ship = ship;
    }

    public ArrayList<Ufo> getUfos()
    {
        return ufos;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public ArrayList<Bomb> getBombs()
    {
        return bombs;
    }

    public ArrayList<Rocket> getRockets()
    {
        return rockets;
    }
}