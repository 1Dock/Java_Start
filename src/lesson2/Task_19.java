package lesson2;

import java.util.Scanner;

public class Task_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (num1 != num2) {
            int sum1 = num1 + num2;
            int sum2 = num1 + num2;
            System.out.print(sum1 +" "+ sum2);
        }
        else {
            num1 = 0;
            num2 = 0;
            System.out.print(num1 +" "+ num2);
        }
    }
}
