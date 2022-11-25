package lesson3;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.print(i+" ");
        }
    }
}
