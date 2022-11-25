package lesson3;

import java.util.Scanner;

public class Task_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += (int)Math.pow(i, 2);
        }

        System.out.print(sum);
    }
}
