package JavaClassPr;

class Author{
    String authorName;
}
public class Book {
    String name;
    Author author;
    double price;
    int qtyInStock;
    Book(String n,double p,int q)
    {
        name=n;
        price=p;
        qtyInStock=q;
        //author=a;

    }
    public String getName()
    {
        return name;
    }
    public int getQtyInStock()
    {
        return qtyInStock;
    }
    public double getPrice()
    {
        return price;
    }
    public Author getAuthor()
    {
        return author;
    }
}

class book1
{
    public static void main(String[] args) {

        Book obj=new Book("sandeep",23.3d,20);
        System.out.println(obj.getName());
        System.out.println(obj.getPrice());
        System.out.println(obj.getQtyInStock());
        System.out.println(obj.getAuthor());
    }


}


