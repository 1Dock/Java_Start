package lesson6;

import java.util.Scanner;

public class Task_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String task = in.nextLine();
        String[] operators = task.split(" ");
        
        int num1 = Integer.parseInt(operators[0]);
        int num2 = Integer.parseInt(operators[2]);
        String operator = operators[1];
        
        switch (operator) {
            case "+":
                System.out.print(num1 + num2);
                break;
            case "-":
                System.out.print(num1 - num2);
                break;
            case "*":
                System.out.print(num1 * num2);
                break;
            case "/":
                System.out.print(num1 / num2);
                break;
        }
    }
}