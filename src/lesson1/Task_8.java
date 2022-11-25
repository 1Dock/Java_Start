package lesson1;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println((int)Math.pow(number, 2));
        System.out.println((int)Math.pow(number, 3));
    }
}