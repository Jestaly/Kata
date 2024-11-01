package PROBLEMS.Problem7;

public class Main {
    // there is a fisherman named ted which is fishing beyond the pond , he is
    // catching a fish in a pond every 2 minutes then he
    // becomes addicted to it then at the 3rd catch he
    // realizes that the fish is full, and he counts them all
    // and goes back to home

    // O(N)
    static void fish() {
        int fishCount = 0;
        int minutes = 0;

        while (fishCount != 3) {
            fishCount++;
            minutes += 2;
        }
        System.out.println("fish bucket is full!");
        System.out.println("fish caught: " + fishCount);
        System.out.println("minutes passed:" + minutes);
    }

    // recursion, still O(N)
    static void fishing(int time, int fishCount) {
        if (fishCount == 3) {
            System.out.println(fishCount);
            System.out.println(time);
            return;
        }
        fishing(time + 2, fishCount + 1);
    }

    public static void main(String[] args) {
        fishing(0, 0);

    }
}
