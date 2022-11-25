package lesson6;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        int index = str1.indexOf(str2);

        if (index != -1) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}