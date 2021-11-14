package JavaClassPr;

public class Outer {
    public void  display()
    {
        System.out.println("outer");
    }
    class Inner
    {
        public void display()
        {
            System.out.println("Inner");
        }

    }
}

class Main
{
    public static void main(String[] args) {
        Outer obj1= new Outer();
        obj1.display();
        Outer.Inner obj2 =obj1.new Inner();
        obj2.display();
    }
}

