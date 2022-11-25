package lesson2;

import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number > 0) {
            number++;
            System.out.print(number);
        }
        else {
            System.out.print(number);
        }
    }
}
