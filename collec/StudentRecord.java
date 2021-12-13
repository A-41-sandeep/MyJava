package com.collec;
import java.util.*;
class Student
{
    String name;
    int roll_no;
    int age;
    public Student(String name,int roll_no,int age)
    {
        this.age=age;
        this.name=name;
        this.roll_no=roll_no;
    }
    public String toString()
    {
        return name+"\t"+roll_no+"\t"+age;
    }
}
public class StudentRecord {
    public static void main(String[] args) {
        Set <Student> obj=new HashSet<>();
        obj.add(new Student("sandeep",48,20));
        obj.add(new Student("kishan",23,21));
        obj.add(new Student("rahul",43,18) );

        Iterator i=obj.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());//compiler will change it as i.next().toString()
        }

    }
}
