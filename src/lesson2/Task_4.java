package lesson2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if (year <= 2019) {
            System.out.print("NO");
        }
        else if (year >= 2021) {
            System.out.print("YES");
        }
        else if (year == 2020) {
            System.out.print("Error");
        }
    }
}

