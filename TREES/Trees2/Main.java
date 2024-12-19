package TREES.Trees2;

import java.util.Scanner;

public class Main {
    public class Node {
        Node left;
        Node right;
        int val;

        Node(int val) {
            this.left = null;
            this.right = null;
            this.val = val;
        }
    }

    public Node root;
    public Scanner in = new Scanner(System.in);

    public void menu() {
        String choice = "";
        while (!choice.toUpperCase().equals("Q")) {
            System.out.println("Menu");
            System.out.println("BST Tree Operations");
            System.out.println("[S] Show");
            System.out.println("[I] Insert");
            System.out.println("[D] Delete");
            System.out.println("[T] Traverse");
            System.out.println("[Q] Quit");
            System.out.print("Enter your Choice: ");
            choice = in.nextLine();

            switch (choice.toUpperCase()) {
                case "S":

                    break;
                case "I":

                    break;
                case "D":

                    break;
                case "T":
                    traverseMenu();
                    break;
                case "Q":
                    System.out.println("Program stopped.");
                    break;
                default:
                    System.out.println("Input not in the choices!");
                    break;
            }
        }

    }

    public void traverseMenu() {
        int choice = 0;
        while (choice != 4) {
            System.out.println("TREE TRAVERSAL");
            System.out.println("Menu");
            System.out.println("[1] InOrder");
            System.out.println("[2] PreOrder");
            System.out.println("[3] PostOrder");
            System.out.println("[4] Exit");
            System.out.print("Enter your Choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Going back...");
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();

    }
}
