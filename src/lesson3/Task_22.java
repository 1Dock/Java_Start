package lesson3;

import java.util.Scanner;

public class Task_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        int count = 0;

        while (num != 0) {
            sum += num;
            count++;
            num = in.nextInt();
        }

        System.out.print(sum / count);
    }
}
