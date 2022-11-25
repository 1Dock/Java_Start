package lesson6;

import java.util.Scanner;

public class Task_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        String strVersa = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            String elementStr = String.valueOf(str.charAt(i));

            strVersa += elementStr;
        }

        if (str.equals(strVersa)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}