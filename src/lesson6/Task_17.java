package lesson6;

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        String s1Versa = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            String elementStr = String.valueOf(s1.charAt(i));

            s1Versa += elementStr;
        }

        if (s2.equals(s1Versa)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}