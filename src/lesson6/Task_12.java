package lesson6;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        for (int i = 0; i < str.length(); i++) {
            String a = String.valueOf(str.charAt(i));

            if (a.equals("a")) {
                System.out.print("o");
            }
            else {
                System.out.print(a);
            }
        }
    }
}