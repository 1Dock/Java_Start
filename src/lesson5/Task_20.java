package lesson5;

import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int temp[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = arr[0][j];
                arr[0][j] = arr[n - 1][j];
                arr[n - 1][j] = temp[0][j];

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}