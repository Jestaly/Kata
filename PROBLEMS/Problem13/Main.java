package PROBLEMS.Problem13;

import java.util.Arrays;

public class Main {
    static int removeElement(int[] nums, int val) {
        int pointer = nums.length - 1;
        int temp = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == nums[pointer]) {
                pointer--;
            }
            if (nums[i] == val) {
                temp = nums[i];
                nums[i] = nums[pointer];
                nums[pointer] = temp;
                pointer--;
                k++;

            }
        }
        System.out.println(Arrays.toString(nums));
        return k;

    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
