package hot100_tricks;

import java.util.HashMap;
import java.util.Map;

public class MajorityNumbers {
    public static void main(String[] args) {
        int[] nums = new int[] {3,3,4};
        System.out.println(majorityNumbers(nums));
    }
    static int majorityNumbers(int[] nums){
        int n = nums.length;
        int ans = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums){
            if (mp.containsKey(num)){
                mp.put(num, mp.get(num) + 1);
            }
            else{
                mp.put(num,1);
            }
        }
        for (Integer key : mp.keySet()){
            if (mp.get(key) > n/2){
                ans = key;
            }
        }
        return ans;
    }
}
