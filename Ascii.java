package JavaClassPr;

public class Ascii{
    public static void main(String[] args) {
        int[] arr={65,66,90,92};
        char c;
        for(int i=0;i<arr.length;i++)
        {   c= (char)arr[i];
            System.out.print(c+" ");
        }
    }
}
