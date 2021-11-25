package com.myname.main;
import java.util.Scanner;
class InvalidStudentException extends Exception {
    public InvalidStudentException(String message)
    {
        super(message);
    }

}

class Student implements Runnable {
    public void run(){}
    private String name;
    private int rollNo;
    private float CPI;

    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setRollNo ( int rollNo){
        this.rollNo = rollNo;
    }

    public int getRollNo () {
        return rollNo;
    }

    public void setCPI ( float CPI){
        this.CPI = CPI;
    }

    public float getCPI () {
        return CPI;
    }
    public String toString ()
    {
        return this.name+"  "+this.rollNo+"  "+this.CPI;
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student o=new Student();
        Thread ob=new Thread(o);
        ob.start();
        Student[] arr = new Student[3];
        Scanner s = new Scanner(System.in);
        for (int i =0; i < arr.length; i++) {
            arr[i] = new Student();
            System.out.println("enter name of Student-" +((int)i+1));
            arr[i].setName(s.nextLine());
            System.out.println("enter roll no Student-" +((int)i+1));
            arr[i].setRollNo(s.nextInt());
            System.out.println("enter cpi Student-" +((int)i+1));
            arr[i].setCPI(s.nextFloat());
            s.nextLine();
        }
        StudentMain obj = new StudentMain();
        System.out.println("enter a roll no");
        try {
            Student obj1 = obj.search(arr, s.nextInt());
            if (obj1 == null)
                throw new InvalidStudentException("roll no do not match");
            else
                System.out.println(obj1.toString());
        } catch (InvalidStudentException e) {
            System.out.println(e);
        }

    }

    public Student search(Student[] arr, int rollno) {
            int i,flag=0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i].getRollNo() == rollno)
                {flag=1;
                    break;}

        }
        if(flag==1)
            return arr[i];
        else
            return null;
    }
}



