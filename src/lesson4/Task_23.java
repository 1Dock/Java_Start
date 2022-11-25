package lesson4;

import java.util.Scanner;

public class Task_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int max = nums[0];
        int min = nums[0];
        double sum = 0;

        for (int i = 0; i < length; i++) {
            sum += nums[i];
            if (nums[i] > max) {
                max = nums[i];
            }
            else if (nums[i] < min) {
                min = nums[i];
            }
        }

        sum = sum - max - min;
        double average = sum / (length - 2);

        System.out.println((int)sum);
        System.out.print(average);
    }
}