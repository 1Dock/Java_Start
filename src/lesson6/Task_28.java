package lesson6;

import java.util.Scanner;

public class Task_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        System.out.print(text
                .replaceAll("(?i)zero", "0")
                .replaceAll("(?i)one", "1")
                .replaceAll("(?i)two", "2")
                .replaceAll("(?i)three", "3")
                .replaceAll("(?i)four", "4")
                .replaceAll("(?i)five", "5")
                .replaceAll("(?i)six", "6")
                .replaceAll("(?i)seven", "7")
                .replaceAll("(?i)eight", "8")
                .replaceAll("(?i)nine", "9"));
    }
}
