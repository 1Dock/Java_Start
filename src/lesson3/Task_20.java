package lesson3;

import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;

        while (num != 0) {
            count++;
            num = in.nextInt();
        }

        System.out.print(count);
    }
}
