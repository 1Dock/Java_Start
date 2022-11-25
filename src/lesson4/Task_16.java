package lesson4;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int k = in.nextInt();

        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                if (nums[i] % k == 0) {
                    System.out.print(nums[i]+" ");
                }
            }
        }
    }
}