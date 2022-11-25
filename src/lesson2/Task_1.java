package lesson2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (num1 > num2) {
            System.out.print(num1);
        }
        else {
            System.out.print(num2);
        }
    }
}
