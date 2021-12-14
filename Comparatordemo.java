package com.collec;
import java.util.*;
class Mycmp implements Comparator<StringBuffer>
{
    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {
        return o2.compareTo(o1);
    }
}
public class Comparatordemo {
    public static void main(String[] args) {
        TreeSet <StringBuffer> obj=new TreeSet<>(new Mycmp());
        StringBuffer a=new StringBuffer("sandeep");
        obj.add(a);
        obj.add(new StringBuffer("kishan"));
        obj.add(new StringBuffer("ram"));
        Iterator i=obj.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }

}
