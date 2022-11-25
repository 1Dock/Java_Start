package lesson2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number > 100 || number < -100) {
            number = 0;
            System.out.print(number);
        }
        else {
            number++;
            System.out.print(number);
        }
    }
}
