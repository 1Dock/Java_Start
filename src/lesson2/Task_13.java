package lesson2;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int employee1 = in.nextInt();
        int employee2 = in.nextInt();
        int employee3 = in.nextInt();

        int max = 0;
        int min = 0;

        if (employee1 > employee2 && employee1 > employee3) {
            max = employee1;
        }
        else if (employee2 > employee1 && employee2 > employee3) {
            max = employee2;
        }
        else if (employee3 > employee1 && employee3 > employee2) {
            max = employee3;
        }

        if (employee1 < employee2 && employee1 < employee3) {
            min = employee1;
        }
        else if (employee2 < employee1 && employee2 < employee3) {
            min = employee2;
        }
        else if (employee3 < employee1 && employee3 < employee2) {
            min = employee3;
        }

        System.out.print(max - min);
    }
}

