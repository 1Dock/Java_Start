package lesson2;

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number > 20) {
            System.out.print(number / 6);
        }
        else {
            System.out.print(number * 6);
        }
    }
}
