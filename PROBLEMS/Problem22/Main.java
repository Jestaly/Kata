package PROBLEMS.Problem22;

import java.util.Arrays;

public class Main {
    public static boolean canSortArray(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[count] > nums[j] &&
                        Integer.bitCount(nums[count]) == Integer.bitCount(nums[j])) {
                    int temp = nums[count];
                    nums[count] = nums[j];
                    nums[j] = temp;
                }
                count++;
            }
            count = 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 20, 16 };
        System.out.println(canSortArray(nums));
    }
}
