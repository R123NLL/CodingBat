package Warmup1;

public class EveryNth {
    public static void main(String[] args) {
        System.out.println(everyNth("abcdefg",2));
    }


    public  static String everyNth(String str, int n) {
        String newString ="";

        for (int i = 0; i <str.length() ; i+=n) {
            newString += str.charAt(i);
        }
        return newString;
    }

}
