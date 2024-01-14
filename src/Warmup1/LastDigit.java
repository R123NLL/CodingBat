package Warmup1;

public class LastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(11, 0));
    }

    public static boolean lastDigit(int a, int b) {
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        return (a % 10 == b);
    }

}
