package DSA14;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        LinkedList<String> lList = new LinkedList<String>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a color: ");
            String color = scanner.nextLine();
            lList.add(color);
        }

        System.out.println(lList);

        scanner.close();

    }
}
