package lesson6;

import java.util.Scanner;

public class Task_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char elementStr = word.charAt(i);

            int ascii = (int)elementStr;

            if (ascii > 64 && ascii < 91) {
                result = String.valueOf(elementStr).toLowerCase();
                System.out.print(result);
            }
            else if (ascii > 96 && ascii < 123) {
                result = String.valueOf(elementStr).toUpperCase();
                System.out.print(result);
            }
            else {
                System.out.print(elementStr);
            }
        }
    }
}