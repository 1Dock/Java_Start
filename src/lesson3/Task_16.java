package lesson3;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        System.out.print(count);
    }
}
