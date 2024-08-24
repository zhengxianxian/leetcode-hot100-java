package hot100_tricks;


import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(singleNumber(nums));
    }
    static int singleNumber(int[] nums){
        int res = 0;
        Map<Integer, Integer> mp = new HashMap();
        for(int num : nums){
            if(mp.containsKey(num)){
                mp.put(num, mp.get(num) + 1);
            }
            else{
                mp.put(num, 1);
            }
        }
        for (Integer key : mp.keySet()){
            if (mp.get(key) == 1){
                res = key;
            }
        }
        return res;
    }
}
