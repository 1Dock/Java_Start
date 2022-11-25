package lesson1;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        String[] dataSplit = data.split(" ");

        System.out.println("University: "+dataSplit[0]);
        System.out.println("Faculty: "+dataSplit[1]);
        System.out.println("Subject: "+dataSplit[2]);
    }
}
