package lesson4;

import java.util.Scanner;

public class Task_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int k = in.nextInt();
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] == k) {
                System.out.println("YES");
                System.out.print(i);
                break;
            }
            else {
                count++;
            }
        }
        if (count == length) {
            System.out.print("NO");
        }
    }
}
