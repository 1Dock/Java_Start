package lesson4;

import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int max = nums[0];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        System.out.print(max+" "+index);
    }
}