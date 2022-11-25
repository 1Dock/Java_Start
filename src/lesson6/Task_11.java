package lesson6;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String symbol = in.next();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            String a = String.valueOf(str.charAt(i));

            if (a.equalsIgnoreCase(symbol)) {
                sum++;
            }
        }

        System.out.print(sum);
    }
}