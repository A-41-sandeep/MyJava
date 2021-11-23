package com.company.multithreading;
class EvenThread extends Thread{
    public void run(){
        for(int i=2;i<=10;i=i+2)
            System.out.println(i);
    }
}
class OddThread extends Thread {

    public void run()
    {
        try {
            EvenThread o=new EvenThread();
            o.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=1;i<10;i=i+2)
            System.out.println(i);
    }
}
public class JoinInThread {
    public static void main(String[] args) {
        EvenThread obj1=new EvenThread();
        OddThread obj2=new OddThread();
        obj1.start();
        obj2.start();

    }

 }
