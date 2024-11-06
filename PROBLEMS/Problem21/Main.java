package PROBLEMS.Problem21;

import java.util.Arrays;

public class Main {
    public static boolean canSortArray(int[] nums) {
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        if (nums.length < 2) {
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                break;
            }
            if (i == nums.length - 2) {
                return true;
            }
        }
        Arrays.sort(nums);
        // 52 76 107
        // 3 3 5
        int noBitCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int bitCountPrev = Integer.bitCount(nums[i]);
            int bitCountNext = Integer.bitCount(nums[i + 1]);
            System.out.println(bitCountPrev);
            System.out.println(bitCountNext);

            if (bitCountPrev > bitCountNext) {
                return false;
            }
            if (bitCountPrev != bitCountNext) {
                noBitCount++;
            }
        }
        if (nums.length == noBitCount + 1) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 107, 76, 52 };
        System.out.println(canSortArray(nums));
    }
}
