package Warmup1;

public class NotString {
    public static void main(String[] args) {
        System.out.println(notString("bad"));
    }
    public  static String notString(String str) {
    if (str.startsWith("not")){
        return str;
    }else
        return "not "+str;
    }
}
