package com.company.ehandling;

import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("enter the size of  array");
        int[] arr=new int[s.nextInt()];
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        try{
            System.out.println("enter the index");
            int j=s.nextInt();
            System.out.println(arr[j]);
        }
        catch(ArrayIndexOutOfBoundsException o)
        {
            System.out.println("class name of thrown exception is Exception");
        }
    }

}
