package hot100_hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutives {
    public static void main(String[] args) {
        int[] nums = new int[]{100,4,200,1,3,2};
        int ans = longestConsecutives(nums);
        System.out.println(ans);
    }
    static int longestConsecutives(int[] nums){
        if (nums.length == 0){
            return 0;
        }
        int ans = 1;
        Set<Integer> nums_set = new HashSet<>();
        for (int num : nums){
            nums_set.add(num);
        }
//        用集合对数进行查询，时间复杂度为O(1)
        for (int num : nums){
            if (nums_set.contains(num - 1)){
                continue;
            }
            int tmp = 1;
            while (nums_set.contains(num + 1)){
                num += 1;
                tmp += 1;
            }
            ans = Math.max(tmp, ans);
        }
        return ans;
    }
}
