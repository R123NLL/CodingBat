package Warmup1;

public class BackAround {
    public static void main(String[] args) {
        System.out.println(backAround("cat"));
    }

    public static String backAround(String str) {
        String start=str.substring(str.length()-1);

        return start+=str+=start;
    }
}
