package Warmup1;

public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("Denis"));
    }
    public static String frontBack(String str) {
        if (str.length()<=1)
            return str;

    char front=str.charAt(0);
    char back=str.charAt(str.length()-1);
    String cut=str.substring(1,str.length()-1);


    return back+cut+front;
    }

}
