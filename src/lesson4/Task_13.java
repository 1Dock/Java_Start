package lesson4;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        double total = 0;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] < 0 ) {
                total += nums[i];
                count++;
            }
        }

        double average = total/count;
        System.out.print(average);
    }
}


