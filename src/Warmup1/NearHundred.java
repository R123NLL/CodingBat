package Warmup1;

public class NearHundred {
    public static void main(String[] args) {
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(190));
        System.out.println(nearHundred(95));
        System.out.println(nearHundred(23));
        System.out.println(nearHundred(230));
        System.out.println(nearHundred(111));
    }

    public static boolean nearHundred(int n) {

        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));

//        if (n >= 90 && n <= 110 || n >= 190 && n <= 210) {
//            return true;
//        } else return false;
    }
}
