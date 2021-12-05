package JavaClassPr;

import java.util.LinkedList;

public class Linklist1 {
    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        obj.add("sandeep");
        obj.add(23);

        System.out.println(obj.get(0));
        System.out.println(obj.get(1));
    }
}
