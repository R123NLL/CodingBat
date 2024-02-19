package Warmup1;

public class StringE {
    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
    }

    public static boolean stringE(String str) {

        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            if (str.contains("e")) {
                counter++;
            }
            if (counter >= 1 && counter <= 3) {
                return true;
            } else return false;
        }
        return true;
    }

    }
