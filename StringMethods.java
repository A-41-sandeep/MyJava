package JavaClassPr;

public class StringMethods {
    public static void main(String[] args) {
        String s = new String("my name is sandeep");
        System.out.println(s.charAt(4));
        String[] r = new String[5];
        //split()
        r = s.split(" ");
        char[] c={'a','b','c','d'};
        //getChars()
        s.getChars(3,7,c,0);
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);

        }
        for(int j=0;j<c.length;j++)
        System.out.println(c[j]);
         //equals()
        String str1="sandeep";
        String str2="sandeep";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));

        System.out.println(String.valueOf('d'));

    }
}