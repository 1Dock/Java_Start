package lesson4;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = in.nextInt();
        double nums[] = new double[(int)length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextDouble();
        }

        int total = 0;

        for (int i = 0; i < length; i++) {
            total += nums[i];
        }

        double average = total/length;
        System.out.print(total+" "+average);
    }
}

