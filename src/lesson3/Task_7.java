package lesson3;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
