package array;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] left_arr = new int[n];
        int[] right_arr = new int[n];
        for (int i = 0; i < n; i ++){
            if (i == 0){
                left_arr[i] = 1;
            }
            else{
                left_arr[i] = left_arr[i-1]*nums[i-1];
            }
        }
        for (int j = n - 1; j > -1; j --){
            if (j == n - 1){
                right_arr[j] = 1;
            }
            else{
                right_arr[j] = right_arr[j + 1] * nums[j + 1];
            }
        }
        int[] ans = new int[n];
        for (int k = 0; k < n; k ++){
            ans[k] = left_arr[k] * right_arr[k];
        }
        return ans;
    }
}
