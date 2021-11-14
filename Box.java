package JavaClassPr;

public class Box {
    int length,breath,height;
    Box()
    {

    }
    public Box(int a, int b, int c)
    {
        length=a;
        breath=b;
        height=c;
    }
    public void area()
    {
        System.out.println(2*(length*breath+breath*height+height*length));
    }
    public void volume()
    {
        System.out.println(length*breath*height);
    }

}

class Box3d extends Box
{
    int l,b,h;
    Box3d(int a,int b,int c)
    {

        l=a;
        this.b=b;
        h=c;
    }
    public void area()
    {
        System.out.println(2*(l*b+b*h+h*l));
    }
    public void volume()
    {
        System.out.println(l*b*h);
    }
}
class cuboid
{
    public static void main(String[] args) {
        Box obj=new Box(1,2,3);
        obj.area();
        obj.volume();

        Box3d obj2=new Box3d(2,2,2);
        obj2.area();
        obj2.volume();
    }
}

