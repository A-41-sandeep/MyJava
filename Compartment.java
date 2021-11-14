package JavaClassPr;

public abstract class Compartment {
    public abstract String  notice();
}
class Firstclass extends Compartment
{
    public String notice() {
        return "Firstclass";
    }
}
class Ladies extends Compartment
{
    public String notice()
    {
        return "Ladies";
    }
}
class General extends Compartment
{
    public String notice() {
        return "General";
    }
}
class laguage extends Compartment
{
    public String notice() {
        return "laguage";
    }
}


