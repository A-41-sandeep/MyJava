package com.company.ehandling;

import java.util.Scanner;

public class Assign1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try {
            int i = Integer.parseInt(s.nextLine());
            System.out.println(i * i);
        }
        catch (Exception o)
        {
            System.out.println("Entered input is not a valid format for an integer.");
        }

    }
}
