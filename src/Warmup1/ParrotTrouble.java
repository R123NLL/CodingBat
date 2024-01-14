package Warmup1;

public class ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {

        return (talking && (hour < 7 || hour > 20));
//        boolean flag=true;
//        if (!talking)
//            flag=false;
//        if(talking && (hour<7 || hour>23))
//            flag=true;
//
//        return flag;
    }

}
