package Warmup1;

public class LoneTeen {

    public static void main(String[] args) {

        System.out.println(loneTeen(14,13));
    }
    public  static boolean loneTeen(int a, int b) {
       boolean aTeen= (a>=13 && a<=19);
       boolean bTeen= (b>=13 && b<=19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

}
