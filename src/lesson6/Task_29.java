package lesson6;

import java.util.Scanner;

public class Task_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String task = in.nextLine();
        String[] taskSplit = task.split(" ");
        int num1 = Integer.parseInt(taskSplit[0]);
        int num2 = Integer.parseInt(taskSplit[2]);
        int num3 = Integer.parseInt(taskSplit[4]);

        String operator1 = taskSplit[1];
        String operator2 = taskSplit[3];

        int sum = 0;

        if (operator2.equals("*") || operator2.equals("/")) {
            switch (operator2) {
                case "*":
                    sum = num2 * num3;
                    break;
                case "/":
                    sum = num2 / num3;
                    break;
            }

            switch (operator1) {
                case "+":
                    sum = sum + num1;
                    break;
                case "-":
                    sum = sum - num1;
                    break;
                case "*":
                    sum = sum * num1;
                    break;
                case "/":
                    sum = sum / num1;
                    break;
            }
        }
        else {
            switch (operator1) {
                case "+":
                    sum = num1 + num2;
                    break;
                case "-":
                    sum = num1 - num2;
                    break;
                case "*":
                    sum = num1 * num2;
                    break;
                case "/":
                    sum = num1 / num2;
                    break;
            }

            switch (operator2) {
                case "+":
                    sum = sum + num3;
                    break;
                case "-":
                    sum = sum - num3;
                    break;
                case "*":
                    sum = sum * num3;
                    break;
                case "/":
                    sum = sum / num3;
                    break;
            }
        }

        System.out.println(sum);
    }
}
