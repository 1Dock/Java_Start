package lesson3;

import java.util.Scanner;

public class Task_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num;
            num = in.nextInt();
        }

        System.out.print(sum);
    }
}
