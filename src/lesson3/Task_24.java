package lesson3;

import java.util.Scanner;

public class Task_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 1;

        for (int i = 2; i <= num; i++) {
            sum *= i;
        }

        System.out.print(sum);
    }
}
