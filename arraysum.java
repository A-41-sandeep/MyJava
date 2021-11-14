package JavaClassPr;

import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array");
        int[] arr=new int[s.nextInt()];
        int index1;
        int index2=0,sum=0;

        System.out.println("enter the elements of array"+ arr.length);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {   int flag=0;
            if (arr[i]==6)
            {
                index1=i;
                for(int j=i+1;j<arr.length;j++) {
                    if (arr[j] == 6)
                        index1 = j;
                    if (arr[j] == 7) {
                        index2 = j;
                        flag = 1;
                        break;
                    }
                }
                  if(flag==1) {
                      for (int j = index1; j <= index2; j++) {
                          arr[j] = 0;
                      }
                      i=index2;
                  }
                  else
                      break;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("sum is"+ sum);
            }
}
