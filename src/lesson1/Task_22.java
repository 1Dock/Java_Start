package lesson1;

import java.util.Scanner;

public class Task_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double R = in.nextDouble();

        System.out.println("L=" + (2 * 3.14 * R));
        System.out.println("S=" + (3.14 * Math.pow(R, 2)));
    }
}
