package lesson1;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        System.out.print(((int)Math.pow(x, 4)) + (4 * x * (int)Math.pow(y, 2)) - (4 * y * z) + ((int)Math.pow(z, 4)));
    }
}
