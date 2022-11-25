package lesson6;

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String[] arrStr = word.split(" ");

        for (int i = 0; i < arrStr.length; i++) {
            System.out.print(String.valueOf(arrStr[i].charAt(0)).toUpperCase());

            String line = arrStr[i];

            for (int n = 1; n < line.length(); n++) {
                System.out.print(line.charAt(n));
            }

            System.out.print(" ");
        }
    }
}