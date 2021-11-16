package com.company.ehandling;

import java.util.Scanner;
class OutOfRangeMyException extends Exception
{
    OutOfRangeMyException(String message)
    {
        super(message);
    }
}
class NegativeMarksMyException extends Exception
{
    NegativeMarksMyException(String message)
    {
        super(message);
    }
}

public class NumberFormat {
    public static void main(String[] args) {
        String[] names=new String[2];
        int[] marks1=new int[3];
        int[] marks2=new int[3];
        try(Scanner s=new Scanner(System.in)) {
            System.out.println("enter the name of two students");
            names[0] = s.nextLine();
            names[1] = s.nextLine();
            System.out.println("enter marks of student-1 in three subjects");
            for (int i = 0; i < 3; i++) {
                marks1[i] = Integer.parseInt(s.nextLine());
                if (marks1[i] < 0) {
                    throw new NegativeMarksMyException("entered negative marks");
                }
                if (marks1[i] < 0 || marks1[i] > 100) {
                    throw new OutOfRangeMyException("range crossed");
                }


            }
            System.out.println("enter marks of student-2 in three subjects");
            for (int i = 0; i < 3; i++)
            {
                marks2[i] = Integer.parseInt(s.nextLine());
            if (marks2[i] < 0) {
                throw new NegativeMarksMyException("entered negative marks");
            }
            if (marks2[i] < 0 || marks2[i] > 100) {
                throw new OutOfRangeMyException("range crossed");
            }
        }

            System.out.println("average marks of "+names[0]+" are :"+(marks1[0]+marks1[1]+marks1[2])/3);
            System.out.println("average marks of "+names[1]+" are :"+(marks2[0]+marks2[1]+marks2[2])/3);
        }
        catch(NumberFormatException w)
        {
            System.out.println("you entered a invalid marks (not a integer)");
        }
        catch(OutOfRangeMyException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NegativeMarksMyException r)
        {
            System.out.println(r.getMessage());
        }



    }
}
