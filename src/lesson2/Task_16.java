package lesson2;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if (num1 > 10 && num2 > 10 && num3 > 10) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
