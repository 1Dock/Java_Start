package lesson3;

import java.util.Scanner;

public class Task_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int max = num;

        while (num != 0) {
            num = in.nextInt();

            if (num > max) {
                max = num;
            }
        }

        System.out.print(max);
    }
}
