package array;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }
    static int maxSubArray(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++){
            if (i == 0){
                dp[i] = nums[i];
            }
            else{
                dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            }
        }
        int ans = dp[0];
        for (int num : dp){
            ans = Math.max(ans, num);
        }
        return ans;
    }
}
