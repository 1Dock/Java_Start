package lesson1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        String[] dataSplit = data.split(" ");

        System.out.println("Name: "+dataSplit[0]);
        System.out.println("Surname: "+dataSplit[1]);
        System.out.println("Age: "+dataSplit[2]);
        System.out.println("Country: "+dataSplit[3]);
    }
}
