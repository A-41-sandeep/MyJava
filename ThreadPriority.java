package com.company.multithreading;
class ThreadA extends Thread
{
    public void run()
{
    for(int i=1;i<=5;i++)
    {
        System.out.println(i);
    }
}
}
class ThreadB extends Thread
{
    public void run()
    {
        for(int i=6;i<=10;i++)
            System.out.println(i);
    }
}
class ThreadC extends Thread
{
    public void run()
    {
        for(int i=11;i<=15;i++)
            System.out.println(i);
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        ThreadA A=new ThreadA();
        A.setPriority(A.MAX_PRIORITY);
        ThreadB B=new ThreadB();
        B.setPriority(B.MIN_PRIORITY);
        ThreadC C=new ThreadC();
        C.setPriority(C.NORM_PRIORITY);

        A.start();
        B.start();
        C.start();
    }
}
