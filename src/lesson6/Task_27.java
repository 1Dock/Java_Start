package lesson6;

import java.util.Scanner;

public class Task_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        String s1 = in.next();
        String s2 = in.next();

        System.out.print(word.replaceAll("(?i)" + s1, s2));
    }
}