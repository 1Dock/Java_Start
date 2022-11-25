package lesson3;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i+" "+(int)Math.pow(i, 2));
        }
    }
}
