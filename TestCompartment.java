package JavaClassPr;

import java.util.Scanner;

public class TestCompartment {
    public static void main(String[] args)
    {
        int r=0;
        Compartment[] array=new Compartment[10];
        Scanner s=new Scanner(System.in);

        for(int i=0;i<10;i++)
        {
            System.out.println("enter a number in range 1 to 4");
            r=s.nextInt();
           if(r==1)
            {
                array[i]=new Firstclass();
                System.out.println(array[i].notice());
            }
            if(r==2)
            {
                array[i]=new laguage();
                System.out.println(array[i].notice());
            }
            if(r==3)
            {
                array[i]=new Ladies();
                System.out.println(array[i].notice());
            }
            if(r==4)
            {
                array[i]=new General();
                System.out.println(array[i].notice());
            }
        }


    }
}
