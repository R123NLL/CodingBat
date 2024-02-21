package Warmup1;

import static java.lang.Math.abs;
import static java.lang.Math.max;


public class Close10 {

    public static void main(String[] args) {
        System.out.println(close10(3,8));
    }
    public static int close10(int a, int b) {
        int c =0;
        boolean tie= abs(10-a)==abs(10-b);
        boolean closeA=abs(10-a)<abs(10-b);
        boolean closeB=abs(10-b)<abs(10-a);

        if (tie)
            c = 0;
        else if (closeA)
            c = a;
         else if (closeB)
            c = b;
    return c;
    }

}
