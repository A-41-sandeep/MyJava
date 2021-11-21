package com.company.multithreading;

//import com.sun.jdi.event.ThreadStartEvent;

public class SetThreadName extends Thread {
    public void run() {
        System.out.println("Thread1");
    }
}

class Test2
{
    public static void main(String[] args) {
        SetThreadName obj=new SetThreadName();
        obj.setName("Scooby");
        obj.start();

        System.out.println("SetThreadName has  name: "+obj.getName());
        Thread obj2 = Thread.currentThread();
        obj2.setName("Shaggy");
        System.out.println("Thread Test2 has  name: "+obj2.getName());


    }
}
