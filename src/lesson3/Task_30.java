package lesson3;

import java.util.Scanner;

public class Task_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int price = in.nextInt();
        int dollar = in.nextInt();
        int banana = in.nextInt();

        int temp = price;
        int sum = 0;

        for (int i = 1; i <= banana; i++) {
            price = temp * i;
            sum += price;
        }

        System.out.println(sum - dollar);
    }
}

