package DSA.DSA27;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static String givenArr;
    private static String sortedArr;
    private static int elementsEntered = 0;

    // AUTOMATIC SORT CHECKER
    public static int[] autoSorter(int[] autoArr) {
        int temp = 0;
        int iCounter = 0;
        for (int i = 0; i < autoArr.length; i++) {
            for (int j = 1; j < autoArr.length; j++) {
                if (autoArr[iCounter] > autoArr[j]) {
                    // SWAPPING OF ELEMENTS
                    temp = autoArr[iCounter];
                    autoArr[iCounter] = autoArr[j];
                    autoArr[j] = temp;
                }
                iCounter++;
            }
            iCounter = 0;
        }
        return autoArr;
    }

    // PRINTS GIVEN ARRAY
    public static void printGivenArray(int[] numArr) {
        givenArr = "\t\t\t    Given Array Elements\n\n\t\t   ";
        for (int i = 0; i < numArr.length; i++) {

            givenArr += numArr[i] + " ";
        }
        System.out.println("");
        System.out.println(givenArr);

    }

    // PRINTS ITERATED ARRAY
    public static void printIteratedArray(int[] numArr, int i) {
        System.out.printf("    %2d", (i + 1));
        System.out.print(".");
        for (int j = 0; j < numArr.length; j++) {
            System.out.printf("%4d ", numArr[j]);
        }
        System.out.println();
    }

    // PRINTS SORTED ARRAY
    public static void printOutputArray(int[] numArr) {
        System.out.println("================================================================================");
        sortedArr = "\n\t\t\t    Sorted Elements\n\n\t\t";
        for (int i = 0; i < numArr.length; i++) {
            sortedArr += numArr[i] + " ";
        }
        System.out.println(sortedArr);
        System.out.println("\n\t   ========================================================");
    }

    // BUBBLE SORT METHOD
    public static void bubbleSort(int[] bubArr, int[] autoArr) {

        // PRINTING GIVEN ARRAY VALUES
        System.out.println("\n\t\t=============================================");
        System.out.println("\t\t\t\t Bubble Sort");
        System.out.println("\t\t=============================================");
        printGivenArray(bubArr);
        System.out.println("\n\t\t=============================================");
        System.out.println("\t\t\t    Performing Bubble Sort...");
        System.out.println("================================================================================");

        // INITIALIZING VARIABLES
        int temp = Integer.MIN_VALUE;
        int iCounter = 0;

        // A LOOP FOR ITERATIONS
        for (int i = 0; i < bubArr.length; i++) {
            // A NESTED LOOP TO COMPARE ELEMENTS
            for (int j = 1; j < bubArr.length; j++) {
                // A CONDITION TO ACTUALLY COMPARE ELEMENTS
                if (bubArr[iCounter] > bubArr[j]) {
                    // SWAPPING OF ELEMENTS
                    temp = bubArr[iCounter];
                    bubArr[iCounter] = bubArr[j];
                    bubArr[j] = temp;
                }
                // A COUNTER WHICH TASK IS TO INCREMENT AND COMPARE ELEMENTS IN A NESTED LOOP
                iCounter++;
            }
            // RESETS COUNTER TO 0 TO START AGAIN FROM THE BEGINNING
            iCounter = 0;

            // PRINTING THE ARRAYS IN EACH ITERATIONS
            printIteratedArray(bubArr, i);

            // COMPARES ARRAY TO SORTED ARRAY
            if (Arrays.equals(bubArr, autoSorter(autoArr))) {
                break;
            }
        }
        // PRINTING THE SORTED OUTPUT
        printOutputArray(bubArr);
    }

    // SELECTION SORT METHOD
    public static void selectionSort(int[] selArr, int[] autoArr) {

        // PRINTING GIVEN ARRAY VALUES
        System.out.println("\n\t\t=============================================");
        System.out.println("\t\t\t\tSelection Sort");
        System.out.println("\t\t=============================================");
        printGivenArray(selArr);
        System.out.println("\n\t\t=============================================");
        System.out.println("\t\t\t  Performing Selection Sort...");
        System.out.println("============================================================================");

        // INITIALIZING VARIABLES
        int temp = Integer.MIN_VALUE;
        int smallNum = Integer.MIN_VALUE;
        int pos = Integer.MIN_VALUE;

        // A LOOP FOR ITERATIONS
        for (int i = 0; i < selArr.length; i++) {
            // INITIALIZING A BOOLEAN VARIABLE IN A LOOP EACH ITERATIONS
            // ASSIGNING THE LATEST numS AT INDEX i TO THE smallestNum
            smallNum = selArr[i];
            // LOOP FOR COMPARISON
            for (int j = i; j < selArr.length; j++) {
                // A CONDITION TO COMPARE ELEMENTS IN EACH ITERATIONS TO THE VARIABLE
                if (selArr[j] <= smallNum) {
                    // ASSIGNING numS AND ITERATOR IN A VARIABLE
                    smallNum = selArr[j];
                    pos = j;
                }
            }

            // SWAPPING OF ELEMENTS
            temp = selArr[i];
            selArr[i] = smallNum;
            selArr[pos] = temp;

            // PRINTING ARRAYS IN EACH ITERATIONS
            printIteratedArray(selArr, i);

            // COMPARES ARRAY TO SORTED ARRAY
            if (Arrays.equals(selArr, autoSorter(autoArr))) {
                break;
            }
        }
        // PRINTING THE SORTED OUTPUT
        printOutputArray(selArr);
    }

    // INSERTION SORT METHOD
    public static void insertionSort(int[] insArr, int[] autoArr) {

        // PRINTING THE GIVEN ARRAY VALUES
        System.out.println("\n\t\t=============================================");
        System.out.println("\t\t\t\tInsertion Sort");
        System.out.println("============================================================================");
        printGivenArray(insArr);
        System.out.println("\n\t\t=============================================");
        System.out.println("\t\t\t Performing Insertion Sort...");
        System.out.println("\t\t=============================================");

        // INITIALIZING VARIABLES
        int temp = Integer.MIN_VALUE;
        int counter = Integer.MIN_VALUE;
        int iCounter = Integer.MIN_VALUE;

        // LOOP FOR ITERATIONS
        for (int i = 0; i < insArr.length; i++) {
            // ASSIGNING i TO iCounter
            iCounter = i;
            // A CONDITION IF i IS NOT EQUAL TO LENGTH - 1 THEN INCREMENT counter BY i+1
            if (i != insArr.length - 1) {
                counter = i + 1;
            }
            // A CONDITION OF i IS NOT EQUAL TO 0 THEN START PRINTING THE ARRAYS
            if (i != 0) {
                // PRINTING ARRAYS IN EACH ITERATIONS
                printIteratedArray(insArr, i - 1);
            }

            // COMPARES ARRAY TO SORTED ARRAY
            if (Arrays.equals(insArr, autoSorter(autoArr))) {
                printOutputArray(insArr);
                break;
            }

            // A LOOP TO COMPARE EACH ELEMENTS
            while (insArr[counter] < insArr[iCounter]) {
                // SWAPPING OF ELEMENTS
                temp = insArr[counter];
                insArr[counter] = insArr[iCounter];
                insArr[iCounter] = temp;

                // IF THESE TWO VARIABLES ARE NOT EQUAL TO 0 THEN DECREMENT THEM
                if (iCounter != 0 && counter != 0) {
                    iCounter--;
                    counter--;
                }
            }
        }
    }

    // EXIT METHOD
    public static boolean exit(Scanner scanner) {
        System.out.print('\u000C');
        while (true) {
            System.out.println("\n\t      ==================================================");
            System.out.print("\t\t\t     Exit the Program? [Y/N]: ");
            System.out.println("\n\t\t=============================================");
            String exit = scanner.nextLine();

            if (exit.toLowerCase().equals("n")) {
                System.out.print('\u000C');
                System.out.println("\n\t      ==================================================");
                System.out.println("\t\t\t    Returning to the Program.");
                System.out.println("\t\t=============================================");
                break;
            } else if (exit.toLowerCase().equals("y")) {
                System.out.print('\u000C');
                System.out.println("\n\t      ==================================================");
                System.out.println("\t\t\t        Program Exited.");
                System.out.println("\t\t=============================================");
                return false;
            } else {
                System.out.print('\u000C');
                System.out.println("\n\t      ==================================================");
                System.out.println("\t\t\t   Invalid Input. Try Again.");
                System.out.println("\t\t=============================================");
            }
        }
        return true;
    }

    // MAIN METHOD
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        boolean sizeExc = true;
        int size = 0;
        while (sizeExc) {
            do {
                try {
                    System.out.println("\n\t\t=============================================");
                    System.out.println("\t\t\t Enter Array Size (5 to 15): ");
                    System.out.println("\t\t=============================================");
                    size = scanner.nextInt();
                    if (size >= 5 && size <= 15) {
                        sizeExc = false;
                        break;
                    } else {
                        System.out.print('\u000C');
                        System.out.println("\n\t      ==================================================");
                        System.out.println("\t\t  Error: Array size must be between 5 and 15.");
                        System.out.println("\t      ==================================================");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.print('\u000C');
                    System.out.println("\n\t      ==================================================");
                    System.out.println("\t\t  Invalid Input. Please enter a valid integer.");
                    System.out.println("\t      ==================================================");
                    scanner.next();
                }
            } while (size < 5 || size > 15);
        }

        final int[] num = new int[size];

        boolean elemExc = true;
        int eCounter = 0;
        System.out.print('\u000C');
        while (elemExc) {
            try {

                for (int i = eCounter; i < size; i++) {
                    System.out.print('\u000C');
                    displayArray(num, eCounter);
                    System.out.println("\n\t\t=============================================");
                    System.out.println("\t\t\t --> Enter Element " + "[ " + (i + 1) + " ] <--");
                    System.out.println("\t\t=============================================");
                    num[eCounter] = scanner.nextInt();
                    eCounter++;
                }

                break;
            } catch (Exception e) {
                System.out.print('\u000C');
                System.out.println("\n\t\t=============================================");
                System.out.println("\t\t\tInvalid input. Please enter a valid integer.");
                System.out.println("\t\t=============================================");
                scanner.next();
            }
        }
        System.out.print('\u000C');
        boolean loop = true;
        while (loop) {
            int choice = 0;
            boolean choiceExc = true;
            while (choiceExc) {
                try {
                    System.out.println("\n\n\t\t=============================================");
                    System.out.println("\t\t\t      --- MAIN MENU ---");
                    System.out.println("\t\t=============================================\n");
                    System.out.println("\t\t\t   [1] BUBBLE SORT\n\n");
                    System.out.println("\t\t\t   [2] SELECTION SORT\n\n");
                    System.out.println("\t\t\t   [3] INSERTION SORT\n\n");
                    System.out.println("\t\t\t   [4] EXIT\n\n");
                    System.out.println("\t\t\t   Enter your choice: \n");
                    choice = scanner.nextInt();
                    if (!(choice <= 0 || choice >= 5)) {
                        break;
                    }
                    System.out.println("\n\t\t=============================================");
                    System.out.println("\t\tInvalid choice. Please select a valid option.");
                    System.out.println("\t\t=============================================");
                } catch (Exception e) {
                    System.out.println("\n\t\t=============================================");
                    System.out.println("\t\tInvalid input. Please enter a valid integer.");
                    System.out.println("\t\t=============================================");
                    scanner.next();
                }
            }
            scanner.nextLine();

            int[] bubArr = new int[size];
            int[] selArr = new int[size];
            int[] insArr = new int[size];
            int[] autoArr = new int[size];

            for (int i = 0; i < size; i++) {
                bubArr[i] = num[i];
                selArr[i] = num[i];
                insArr[i] = num[i];
                autoArr[i] = num[i];
            }

            switch (choice) {
                case 1:
                    System.out.print('\u000C');
                    bubbleSort(bubArr, autoArr);
                    break;
                case 2:
                    System.out.print('\u000C');
                    selectionSort(selArr, autoArr);
                    break;
                case 3:
                    System.out.print('\u000C');
                    insertionSort(insArr, autoArr);
                    break;
                case 4:
                    if (exit(scanner) == false) {
                        loop = false;
                    }
                    break;
            }
        }
        scanner.close();
    }

    private static void displayArray(int[] array, int elementsEntered) {
        System.out.println("\n\t\t\t    --Current Array Elements--");
        System.out.println("\t\t=============================================");
        System.out.print("\t       ");
        for (int i = 0; i < array.length; i++) {
            if (i < elementsEntered) {
                System.out.printf("    %4d", array[i]);
            } else {
                System.out.print("");
            }
            if ((i + 1) % 5 == 0) {
                System.out.print("\n\t       ");
            }
        }
        System.out.println();
    }

}
