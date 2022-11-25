package lesson2;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int max = 0;

        if (num3 > num2 && num3 > num1) {
            max = num3;
        }
        else if (num2 > num3 && num2 > num1) {
            max = num2;
        }
        else if (num1 > num3 && num1 > num2) {
            max = num1;
        }

        System.out.print(max);
    }
}
