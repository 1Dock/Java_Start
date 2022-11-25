package lesson4;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int total = 0;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] % 2 == 0) {
                total += nums[i];
                count++;
            }
        }

        int average = total/count;
        System.out.print(average);
    }
}

