package com.company.multithreading;

public class MyThread extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println("MyThread");

    }

}
class test
{
    public static void main(String[] args) throws InterruptedException {

           MyThread obj = new MyThread();
           obj.start();
           Thread.sleep(10000);

           for(int i=0;i<5;i++)
            System.out.println("test");
    }
}
