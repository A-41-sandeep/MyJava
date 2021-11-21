package com.company.multithreading;
//import java.lang.Thread;
public class MyThread1 implements Runnable{
    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println("Mythread");
    }
}
class Test1
{
    public static void main(String[] args) {
        MyThread1 obj1=new MyThread1();
        Thread obj=new Thread(obj1);
        obj.start();
        for(int i=0;i<5;i++)
        System.out.println("test");

    }
}
