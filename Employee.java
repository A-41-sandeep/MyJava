package com.company;

import java.util.Scanner;

// encapsulation
public class
Employee {
    private int eid;
    private String ename;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}

class Emp {
    public static void main(String[] args) {
        Employee obj = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the id of employee");
        obj.setEid(sc.nextInt());
        //sc.nextLine();
        System.out.println("enter name of employee");
        //obj.setEname(sc.nextLine());
        obj.setEname(sc.next());

        System.out.println("obj id is");
        System.out.println(obj.getEid());
        System.out.println("obj name is");
        System.out.println(obj.getEname());
    }
}