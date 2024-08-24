package hot100_hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{3,3,6};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] nums, int target){
        int n = nums.length;
        int[] ans = new int[2];
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++){
            if(mp.containsKey(target - nums[i])){
                ans[0] = mp.get(target - nums[i]);
                ans[1] = i;
                break;
            }
            else{
                mp.put(nums[i], i);
            }
        }
        return ans;
    }
}
