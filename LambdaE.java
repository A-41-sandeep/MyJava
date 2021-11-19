package JavaClassPr;

interface LabdaTest
{
   public void m1();
}
public class LambdaE  {
    public static void main(String[] args) {
        LabdaTest obj=() -> System.out.println("i am lambda expression");
        obj.m1();    
    }

}
