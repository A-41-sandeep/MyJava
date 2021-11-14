package JavaClassPr;
import java.util.Scanner;
public class Arrayque1 {
    public static void main(String[] args) {
        int number;
        int[] arr ={12,13,14,15};
        Scanner s=new Scanner(System.in);
        number=s.nextInt();
        int f=0,i;
        for(i=0;i<arr.length;i++)
        {
            if (arr[i]==number)
            {
                f=1;
                break;
            }
        }
        if (f==1)
        {
            System.out.println("number present at index "+ i);
        }
        else
            System.out.println("not found");



    }
}
