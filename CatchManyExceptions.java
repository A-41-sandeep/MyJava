package JavaClassPr;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class CatchManyExceptions {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        try(Scanner s=new Scanner(System.in))
        {
            System.out.println("enter the two number and a index");
            int a=s.nextInt();
            int b=s.nextInt();
            int index=s.nextInt();
            System.out.println(a/b);
            System.out.println(arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException | MissingFormatArgumentException  e)
        {
            System.out.println(e);
        }

    }
}
