package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach beach) { //https://javarush.ru/help/6104 & https://javarush.ru/help/33272
        int result = ((int) this.getDistance() - (int) beach.getDistance()) - (this.getQuality() - beach.getQuality());

        if (this.equals(beach)) {
            return 0;
        } else if (this.getDistance() > beach.getDistance() && this.getQuality() > beach.getQuality()) {
            return result;
        } else if (this.getDistance() < beach.getDistance() && this.getQuality() < beach.getQuality()) {
            return result;
        } else if ((this.getDistance() == beach.getDistance()) && this.getQuality() == beach.getQuality()) {
            return 0;}

        return (int) ((int) this.getQuality() - this.getDistance()) - ((int) beach.getDistance() -  beach.getQuality());
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach tenerife = new Beach("Tenerife", 5800, 9);
        Beach gran_kanaria = new Beach("Gran Kanaria", 5800, 9);
        int result = tenerife.compareTo(gran_kanaria);

        if (result > 0) {
            System.out.println("Terenife is greatest than Gran Kanaria on " + result);
        } else if (result < 0) {
            System.out.println("Gran Kanaria is greatest than Terenife on " + result);
        } else {
            System.out.println("Two beaches are equals");
        }

    }
}
