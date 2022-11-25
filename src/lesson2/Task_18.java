package lesson2;

import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number > 0) {
            number++;
            System.out.print(number);
        }
        else if (number == 0) {
            System.out.print(number = 10);
        }
        else {
            System.out.print(number -= 2);
        }
    }
}
