package Warmup1;

public class StringE {
    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
    }

    public static boolean stringE(String str) {
        int counter=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == 'e') {
                counter++;
            }
        }
        boolean answer=(counter>=1 && counter<=3);
        return answer?true:false;
    }

    }
