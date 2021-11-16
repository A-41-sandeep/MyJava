package com.company.ehandling;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in)) {
            System.out.println("enter the size of array");
            int arr[] = new int[s.nextInt()];
            s.nextLine();
            System.out.println("enter the elements of array");
            for (int i = 0; i < arr.length; i++)
            {
                arr[i]=Integer.parseInt(s.nextLine());
            }
            System.out.println("enter the index you want to access");
            System.out.println(arr[s.nextInt()]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getClass());
        }
        catch(NumberFormatException w)
        {
            System.out.println(w.getClass());
        }


    }
}
