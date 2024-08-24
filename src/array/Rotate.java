package array;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));

    }
    static void rotate(int[] nums, int k){
        int k1 = k % nums.length;
        int left = 0, right = nums.length - 1;
        swap(nums, left, right);
        swap(nums, left, k1 - 1);
        swap(nums, k1, right);
    }
    static void swap(int[] nums, int left, int right){
        while(left <= right){
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left += 1;
            right -= 1;
        }
    }
}
