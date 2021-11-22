package com.company.multithreading;

public class ThreadControl extends Thread{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            if(i==6) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i);
        }
    }
}
class test3
{
    public static void main(String[] args) {
        ThreadControl obj=new ThreadControl();
        obj.start();
    }
}
