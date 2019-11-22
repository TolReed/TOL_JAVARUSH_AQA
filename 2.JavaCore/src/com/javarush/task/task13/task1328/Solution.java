package com.javarush.task.task13.task1328;

/* 
Битва роботов
*/

public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);

        /*System.out.println("!_ FOR TESTING PURPOSES _!");
        Robot robot = new Robot("amigo");

        for (int i = 0; i < 100; i++) {
            BodyPart bodyPart = robot.attack();
            robot.defense();
            if (bodyPart.equals(BodyPart.CHEST)) {
                System.out.println("success");
                return;
            }
        }
        System.out.println("fail");
        System.out.println("!_ FOR TESTING PURPOSES _!");*/
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defenced));
    }
}
