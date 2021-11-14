package JavaClassPr;


import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the number and no. of digits in the given number");
        int num =scan.nextInt();
        int digit=scan.nextInt();
        int arr[]=new int[digit];
        int m=num;
        for(int i=0;i<arr.length;i++)
        {

            arr[i]=m%10;
            m/=10;

        }
        int reverse=0;

        for(int i=0;i<arr.length;i++)
        {
            reverse=10*reverse+arr[i];
        }
        if (reverse==num)
        {
            System.out.println("number is palindrome");

        }
        else
        {
            System.out.println("not palindrome");
        }


    }
}
