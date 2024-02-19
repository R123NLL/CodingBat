package Warmup1;

public class DelDel {
    public static void main(String[] args) {
        System.out.println(delDel("ad"));
    }
    public static String delDel(String str) {
        if (str.length() <= 3)
            return str;
        else {
            String afterDel = str.charAt(0) + str.substring(4);
            return str.startsWith("del", 1) ? afterDel : str;
        }
    }

}
