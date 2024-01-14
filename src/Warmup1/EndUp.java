package Warmup1;

public class EndUp {
    public static void main(String[] args) {
        System.out.println(endUp("he"));
    }

    public static String endUp(String str) {
        if (str.length() <= 3)
            return str.toUpperCase();

        String start = new String(str.substring(0, str.length() - 3));
        String end = new String(str.substring(str.length() - 3));
        return start + end.toUpperCase();



    }

}
