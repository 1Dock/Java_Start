package lesson4;

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int sum = 1;

        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                sum *= nums[i];
            }
        }

        System.out.print(sum);
    }
}