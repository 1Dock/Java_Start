package lesson4;

import java.util.Scanner;

public class Task_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int indexZeroFirst = 0;
        int indexZeroLast = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                indexZeroFirst = i;
                break;
            }
        }

        for (int i = indexZeroFirst + 1; i < length; i++) {
            if (nums[i] == 0) {
                indexZeroLast = i;
                break;
            }
        }

        int sum = 0;

        for (int i = indexZeroFirst; i < indexZeroLast; i++) {
            sum += nums[i];
        }

        System.out.print(sum);
    }
}
