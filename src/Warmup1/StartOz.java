package Warmup1;

public class StartOz {

    public static void main(String[] args) {
        System.out.println(startOz(""));
    }

    public static String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result += str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += str.charAt(1);
        }

        return result;
    }
}
