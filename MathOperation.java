package com.company.ehandling;

public class MathOperation {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int s=0;
        try {
            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(args[i]);
                s = s + arr[i];
            }
            System.out.println("sum = " + s);
            System.out.println("average = " + s / 5);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(NumberFormatException n)
        {
            System.out.println(n.getClass().getName());
        }

    }
}
