package PROBLEMS.Problem13;

import java.util.Arrays;

public class Main {
    static int removeElement(int[] nums, int val) {

        int right = nums.length - 1;
        int k = 0;
        int removeCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                removeCount++;
            }
        }
        if (removeCount == nums.length) {
            return k;
        }
        for (int left = 0; left < nums.length; left++) {

            if (nums.length == 0) {
                return k = 0;
            }
            if (left == right) {
                break;
            }
            for (int j = left; j < nums.length; j++) {
                if (nums[left] == nums[right] && nums[left] == val) {
                    right--;
                    continue;
                }
                if (nums[left] == val) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    right--;
                    break;
                }
            }
            if (nums[left] != nums[right] && nums[left] == val) {
                break;
            }
            // System.out.println(Arrays.toString(nums));
            // System.out.println(left);
            // System.out.println(right);
            if (left == right) {
                break;
            }
        }
        int i = 0;
        while (nums[i] != val) {
            k++;
            if (i == nums.length - 1) {
                return k;
            }
            i++;
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 4, 4, 0, 4, 4, 4, 0, 2 };
        int val = 4;
        System.out.println(removeElement(nums, val));
    }
}
