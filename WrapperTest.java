package JavaClassPr;

public class WrapperTest {
    /*public static void main(String ar[])
    {
        int x = 10;
        Integer y = new Integer(10);
        System.out.println(x == y);
        System.out.println(y
        );
    }*/
    /*static Integer I;

    public static void main(String args[]) {
        System.out.println(I);
        int m = I;
        System.out.println(m);

    }*/
    /*public static void main(String args[]) {
        Integer X = 10;
        Integer Y = X;
        X++;
        X--;

        System.out.println(X);
        System.out.println(Y);
        System.out.println(X == Y);

    }*/
    static void function(int i) {
        System.out.println("int");
    }

    static void function(Integer i) {
        System.out.println("Integer");
    }

    public static void main(String args[]) {
        byte b = 10;
        function(b);

    }
}