package Warmup1;

public class Diff21 {
    public static void main(String[] args) {
        System.out.println(diff21(25));
    }


    public static int diff21(int n) {
        if(n>=21)
            return Math.abs((n-21)*2);
        else return Math.abs(21-n);

    }

}
