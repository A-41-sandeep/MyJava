package com.company;
import java.util.Scanner;
public class ScanTut {
    public static void main(String[] args) {

        Scanner str= new Scanner(System.in);
        System.out.println("enter a number");
        int a = str.nextInt();

        str.nextLine();

        System.out.println("enter your name");
        String s= str.nextLine();



        System.out.println("enter your salary");
        float salary= str.nextFloat();

        System.out.println(a);
        System.out.println(" my name is");
        System.out.println(s);
        System.out.println("your salary amount is ");
        System.out.println(salary);
    }
}
