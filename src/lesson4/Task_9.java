package lesson4;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int positive = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {
                positive++;
            }
        }

        System.out.print(positive);
    }
}

