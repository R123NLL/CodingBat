package Warmup1;

public class In3050 {
    public boolean in3050(int a, int b) {
        boolean aRange1 = a >= 30 && a <= 40;
        boolean bRange1 = b >= 30 && b <= 40;
        boolean aRange2 = a >= 40 && a <= 50;
        boolean bRange2 = b >= 40 && b <= 50;

        if (aRange1 && bRange1) {
            return true;
        } else if (aRange2 && bRange2) {
            return true;
        } else
            return false;
    }
}
