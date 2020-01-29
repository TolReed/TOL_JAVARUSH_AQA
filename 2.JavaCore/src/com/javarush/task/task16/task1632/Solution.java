package com.javarush.task.task16.task1632;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static
    {
        threads.add(new Thread_1());
        threads.add(new Thread_2());
        threads.add(new Thread_3());
        threads.add(new Thread_4());
        threads.add(new Thread_5());
    }
    public static void main(String[] args) throws InterruptedException
    {


        for (Thread elem: threads)
        {
            elem.start();
        }

    }

    public static class Thread_1 extends Thread
    {
        @Override
        public void run()
        {
            while (true)
            {

            }
        }
    }
    public static class Thread_2 extends Thread
    {
        @Override
        public void run()
        {
            while (!Thread.currentThread().isInterrupted())
            {

            }
            System.out.println("InterruptedException");
        }
    }
    public static class Thread_3 extends Thread
    {
        @Override
        public void run()
        {
            while (true)
            {
                System.out.println("Ура");
                try
                {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public static class Thread_4 extends Thread implements Message
    {

        @Override
        public void showWarning()
        {
            interrupt();
        }

        @Override
        public void run()
        {
            while (!isInterrupted())
            {
            }
        }

    }
    public static class Thread_5 extends Thread
    {
        @Override
        public void run()
        {
            Scanner scanner = new Scanner(System.in);
            Integer sum = 0;
            while (true)
            {
                String tmp = "";
                try
                {
                    tmp = scanner.nextLine();
                    sum += Integer.parseInt(tmp);
                }
                catch (Exception e)
                {
                    if (tmp.equals("N"))
                    {
                        System.out.println(sum);
                        scanner.close();
                        return;
                    }

                }

            }
        }
    }
}