package lesson2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number > 10 && number < 20) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
