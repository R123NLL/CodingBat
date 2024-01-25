package Recursion1;

public class BunnyEars {
    public static void main(String[] args) {
        System.out.println(bunnyEars(4));
    }

    public static int bunnyEars(int bunnies) {


        return bunnies == 0 ? 0 : bunnyEars(bunnies - 1) + 2;
    }

}
