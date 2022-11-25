package lesson3;

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        int k = 1;

        for (int i = 0; i < num; i++) {
            sum += k;
            k += 2;
        }

        System.out.print(sum);
    }
}
