package lesson6;

import java.util.Scanner;

public class Task_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        String[] textSplit = text.split(" ");

        for (int i = 0; i < textSplit.length; i++) {
            for (int n = textSplit[i].length() - 1; n >= 0; n--) {
                System.out.print(textSplit[i].charAt(n));
            }

            System.out.print(" ");
        }
    }
}
