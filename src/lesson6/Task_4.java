package lesson6;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        if ("java".equalsIgnoreCase(str)) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
