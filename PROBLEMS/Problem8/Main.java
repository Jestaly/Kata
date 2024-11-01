package PROBLEMS.Problem8;

public class Main {

    // A gardener has 10 plants lined up in a row, each needing water every 3
    // minutes. The gardener waters each plant one by one, moving to the next plant
    // right after finishing the previous one. Once he reaches the 10th plant, he
    // decides to check how much time has passed since he started. Write a program
    // that calculates and prints the total time it took him to water all the
    // plants.

    static void waterThePlants() {
        int plantNum = 0;
        int time = 0;

        while (plantNum != 10) {
            plantNum++;
            time += 3;
        }
        System.out.println("Time passed: " + time);
        System.out.println("Number of plants watered: " + plantNum);
    }

    public static void main(String[] args) {
        waterThePlants();

    }
}
