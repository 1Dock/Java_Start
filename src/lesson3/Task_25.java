package lesson3;

import java.util.Locale;
import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double num = in.nextDouble();
        double sum = 1;

        while (num != 0) {
            sum *= num;
            num = in.nextDouble();
        }

        sum = (double)Math.round(sum * 1000)/1000;

        System.out.print(sum);
    }
}
