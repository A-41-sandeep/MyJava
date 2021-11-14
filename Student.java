package JavaClassPr;

public class Student {
    String name;
    Student() //non parameterised constructor
    {
        name="Unknown";

    }
    Student(String n)   // parameterised constructor
    {
        name=n;
    }
    public void ShowName()
    {
        System.out.println(name);
    }
}

//execution class
class StudentName {
    public static void main(String[] args)
    {
        Student obj =new Student();
        obj.ShowName();

        Student obj2 = new Student("sandeep"); //calling constructor by  passing parameter
        obj2.ShowName();
    }

}