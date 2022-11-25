package lesson6;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String Symbol = in.next();
        int index = word.indexOf(Symbol);

        if (index != -1) {
            System.out.print(word.indexOf(Symbol));
        }
        else {
            System.out.print("THERE IS NO SUCH LETTER");
        }
    }
}
