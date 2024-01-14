package Warmup1;

public class Close10 {
    public int close10(int a, int b) {
        if (Math.abs(10 - a) > Math.abs(10 - b)){
            return a;

        }else if (Math.abs(10-b)> Math.abs(10-a)){
            return b;
        }else return 0;

    }

}
