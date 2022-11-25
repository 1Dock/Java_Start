package lesson2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int year = in.nextInt();

        if (month > 0 && month < 13 && year > 999 && year < 2000) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
