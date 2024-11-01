package PROBLEMS.Problem9;

public class Main {

    // An egg collector visits a farm with 4 hen houses. In each hen house, he
    // collects a variable number of eggs every 5 minutes. The eggs collected in
    // each house are 3, 5, 2, and 4, respectively. After finishing all houses, he
    // sums up the total eggs collected and calculates the total time spent. Write a
    // program to display the total eggs collected and the total time spent.

    static void collectEggs() {
        int[] house = { 3, 5, 2, 4 };
        int time = 0;
        int total = 0;
        for (int i = 0; i < house.length; i++) {
            time += 5;
            total += house[i];
        }
        System.out.println("Total eggs collected: " + total);
        System.out.println("Total time spent: " + time);
    }

    public static void main(String[] args) {
        collectEggs();
    }
}
