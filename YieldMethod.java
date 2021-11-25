package com.company.multithreading;

class Thread1 extends Thread {
    @Override
    public void run() {
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 1) {
                Thread2.yield();
                System.out.println("hi");
            }
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        int i;
        for(i=5;i<10;i++)
            System.out.println(i);
        if(i==6)
            Thread1.yield();
    }
}
public class YieldMethod {
    public static void main(String[] args) {
        Thread1 obj=new Thread1();
        Thread2 obj2=new Thread2();
        obj.start();
        obj2.start();

    }
}
