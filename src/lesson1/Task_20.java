package lesson1;

import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int num1 = number % 10;
        number /= 10;
        int num2 = number % 10;
        number /= 10;

        System.out.print(number + num1 + num2);
    }
}
