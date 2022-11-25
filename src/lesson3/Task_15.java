package lesson3;

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.print(sum);
    }
}
