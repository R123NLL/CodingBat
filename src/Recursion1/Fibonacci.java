package Recursion1;

public class Fibonacci {

    public static void main(String[] args) {
        for (int i = 0; i <10+10 ; i++) {
            System.out.println(fibonacci(i));

        }

    }

    public static int fibonacci(int n) {


        return n<2? n: fibonacci(n-1)+fibonacci(n-2);
    }

}
