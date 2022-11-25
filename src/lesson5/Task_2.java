package lesson5;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();

        int arr[][] = new int[2][m];

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}