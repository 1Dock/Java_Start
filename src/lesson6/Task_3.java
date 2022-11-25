package lesson6;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String BITLAB = "BITLAB";

        if (str.equals(BITLAB)) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}