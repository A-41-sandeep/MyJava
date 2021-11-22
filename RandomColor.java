package com.company.multithreading;

import java.util.Random;

public class RandomColor implements Runnable {
    public void run() {
        String[] color = {"red", "blue", "green", "violet", "pink"};
        int r;
        boolean flag = true;
        Random obj = new Random();
        while (flag == true) {
            r = obj.nextInt(5);
            if (color[r] == "red") {
                flag = false;
            }
            System.out.println(color[r]);
        }
    }
}
class test4
{
    public static void main(String[] args) {
        RandomColor obj1=new RandomColor();
        Thread obj2=new Thread(obj1);
        obj2.start();
    }
}

