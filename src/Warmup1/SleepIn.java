package Warmup1;

public class SleepIn {
    public static void main(String[] args) {
        System.out.println(sleepIn(true,false));
        System.out.println("=======");
        System.out.println(sleepIn(true,true));
        System.out.println("=======");
        System.out.println(sleepIn(false,true));
        System.out.println("=======");
        System.out.println(sleepIn(false,false));
    }

    public  static boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
//        boolean flag=false;
//
//        if(vacation)
//            flag=true;
//        if (!vacation && !weekday)
//            flag=true;
//
//        return flag;
    }

}
