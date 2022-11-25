package lesson4;

import java.util.Scanner;

public class Task_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        boolean correct = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] < 0 && nums[i + 1] < 0) || (nums[i] > 0 && nums[i + 1] > 0)) {
                correct = false;
                break;
            }
        }

        if (correct) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
