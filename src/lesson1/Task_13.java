package lesson1;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.print(((int)Math.pow(a, 3)) + (2 * (int)Math.pow(b, 2)) - (3 * a * b) + ((int)Math.pow(c, 3)));
    }
}
