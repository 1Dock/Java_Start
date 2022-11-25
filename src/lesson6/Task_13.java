package lesson6;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        for (int i = str.length() - 1; i >= 0; i--) {
            String a = String.valueOf(str.charAt(i));
            System.out.print(a);
        }
    }
}