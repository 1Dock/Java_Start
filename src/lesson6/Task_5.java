package lesson6;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        if (str1.equalsIgnoreCase(str2) == true) {
            System.out.print("THEY ARE EQUAL");
        }
        else {
            System.out.print("THEY ARE NOT EQUAL");
        }
    }
}
