package lesson5;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums[][] = {{12,5,7,6},{4,0,2,7},{9,1,3,2},{10,-2,4,6}};
        int N = in.nextInt();
        int M = in.nextInt();

        System.out.print(nums[N][M]);
    }
}