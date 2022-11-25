package lesson2;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();

        if (num4 > num3 && num4 > num2 && num4 > num1 && num4 % 2 == 0) {
            System.out.print(num4);
        }
        else if (num3 > num4 && num3 > num2 && num3 > num1 && num3 % 2 == 0) {
            System.out.print(num3);
        }
        else if (num2 > num4 && num2 > num3 && num2 > num1 && num2 % 2 == 0) {
            System.out.print(num2);
        }
        else if (num1 > num4 && num1 > num3 && num1 > num2 && num1 % 2 == 0) {
            System.out.print(num1);
        }
        else {
            System.out.print("Not Found");
        }
    }
}
