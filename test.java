package JavaClassPr;

public interface  test {
    void square();
}
class arithmetic implements test
{
    public void square()
    {
        System.out.println("i am in arithmetic");
    }

}
class ToTestInt //extends arithmetic
{
    public static void main(String[] args) {
        arithmetic obj=new arithmetic();
        //ToTestInt obj=new ToTestInt();
        obj.square();



    }
}
