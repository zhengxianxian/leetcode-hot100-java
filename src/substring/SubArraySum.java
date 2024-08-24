package substring;

import java.util.*;

public class SubArraySum {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        System.out.println(subArraySum(nums, k));

    }
    static int subArraySum(int[] nums, int k){
        int n = nums.length;
        int ans = 0;
        int pre_sum = 0; //表示前缀和
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1); //和为0的出现了1次

        for (int i = 0; i < n; i ++){
            pre_sum = pre_sum + nums[i];
            if (mp.containsKey(pre_sum - k)){
                ans = ans + mp.get(pre_sum - k);
            }
            if (mp.containsKey(pre_sum)){
                mp.put(pre_sum, mp.get(pre_sum) + 1);
            }
            else{
                mp.put(pre_sum, 1);
            }

        }
        return ans;

    }
}
