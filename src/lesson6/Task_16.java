package lesson6;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            Boolean flag = Character.isDigit(a);

            if (flag) {
                sum += Integer.parseInt(String.valueOf(a));
            }
        }

        System.out.print(sum);
    }
}