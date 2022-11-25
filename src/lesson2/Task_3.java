package lesson2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number % 2 == 0) {
            System.out.print("EVEN");
        }
        else {
            System.out.print("ODD");
        }
    }
}
