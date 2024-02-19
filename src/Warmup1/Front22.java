package Warmup1;

public class Front22 {

    public String front22(String str) {
        if (str.length() < 2) {
            String frontBack= str.substring(0);
            return frontBack+str+frontBack;

        } else {
            String frontBack = str.substring(0, 2);
            return frontBack + str + frontBack;
        }
    }
}
