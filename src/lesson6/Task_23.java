package lesson6;

import java.util.Scanner;

public class Task_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            Boolean flag = Character.isDigit(a);

            if (flag) {
                System.out.print("0");
            }
            else {
                System.out.print(a);
            }
        }
    }
}