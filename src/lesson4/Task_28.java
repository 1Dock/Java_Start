package lesson4;

import java.util.Scanner;

public class Task_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];
        int even = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();

            if (nums[i] % 2 == 0) {
                even++;
            }
        }

        int res[] = new int[even];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if(nums[i] % 2 == 0){
                res[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}