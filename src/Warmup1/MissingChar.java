package Warmup1;

public class MissingChar {

    public static void main(String[] args) {
        System.out.println(missingChar("kitten",0));
    }

    public static String missingChar(String str, int n) {
        StringBuilder s=new StringBuilder(str);
        s.deleteCharAt(n);
        String string= String.valueOf(s);
        return string;


    }

}
