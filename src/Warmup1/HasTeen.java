package Warmup1;

public class HasTeen {

    public boolean hasTeen(int a, int b, int c) {

        return (a>=13 && a<=19) ||
                (b>=13 && b<=19) ||
                (c>=13 && c<=19);

//        if (a<=19 && a>=13 || b<=19 && b>=13 || c<=19 && c>=13){
//            return true;
//        }else return false;

    }

}
