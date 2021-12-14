package com.collec;


import java.util.Comparator;
import java.util.TreeMap;

// implementation of custom sorting
public class TreeMapDemo {
    public static void main(String args[])
    {
        TreeMap t = new TreeMap(new MyCom());
        t.put("ccc",10);
        t.put("bbb",20);
        t.put("aaa",30);
        t.put("ddd",40);
        System.out.println(t);
    }
}
class MyCom implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {

        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
