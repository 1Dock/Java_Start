package lesson6;

import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String number = String.valueOf(str.charAt(0));

        int num = Integer.parseInt(number) * 2;

        System.out.print(str.charAt(1) + "" + num);
    }
}