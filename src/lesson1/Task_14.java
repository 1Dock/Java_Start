package lesson1;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        System.out.print(((int)Math.pow(x, 3)) + (5 * x * y) - (6 * z * y) + ((int)Math.pow(z, 3)));
    }
}
