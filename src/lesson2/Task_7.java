package lesson2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if ((num1 - num2) == 100 || (num2 - num1) == 100) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
