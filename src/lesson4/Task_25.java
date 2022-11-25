package lesson4;

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int m = in.nextInt();
        double sum = 0;
        int line = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] > m) {
                sum += nums[i];
                line++;
            }
        }

        System.out.print(sum / line);
    }
}
