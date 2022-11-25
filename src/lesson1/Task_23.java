package lesson1;

import java.util.Scanner;

public class Task_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println((int)Math.sqrt(num1 * num2));
    }
}
