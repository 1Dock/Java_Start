package lesson6;

import java.util.Scanner;

public class Task_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            Boolean flag = Character.isLetter(a);

            if (flag) {
                sum++;
            }
        }

        System.out.print(sum);
    }
}