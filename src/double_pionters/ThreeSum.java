package double_pionters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[]{3,0,-2,-1,1,2};
        List<List<Integer>> ans = threeSum(nums);
        //TODO: 这里需要学习如何输出：Step1 : 将列表转为数组； Step2: 将数组转为字符串
        for (List<Integer> li : ans){
            Integer[] arr = li.toArray(new Integer[li.size()]);
            System.out.println(Arrays.toString(arr));
        }
//        for (List<Integer> li : ans){
//            System.out.print("[");
//            for (Integer n : li){
//                System.out.print(n + ","); //TODO: 这里 加号连接的是字符串，必须用双引号；如果用单引号就是逗号的ascii码值了
//            }
//            System.out.println(" ]");
//
//        }
    }
    static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int target = 0;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i <= n - 3; i++){
            if (nums[i] > target){
                return ans;
            }
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int k = n - 1;
            int flag = 0;

            for (int j = i + 1; j < k; j ++){

                int cnt = 0;
                List<Integer> li = new ArrayList<>();

                if (j > i + 1 && nums[j] == nums[j-1]){
                    continue;
                }
                if (nums[i] + nums[j] > target){
                    break;
                }
                else if (nums[i] + nums[j] == target){
                    for (int m = j + 1; m <= k; m ++){
                        if (nums[m] == 0){
                            //TODO: list.add()里面的参数可以为Array类型的吗？
                            li.add(nums[i]);
                            li.add(nums[j]);
                            li.add(nums[m]);
                            break;
                        }
                    }
                }
                else {
                    for (int s = k; s > j; s--){
                        if (nums[i] + nums[j] + nums[s] == target){
                            li.add(nums[i]);
                            li.add(nums[j]);
                            li.add(nums[s]);
                            cnt += 1;
                            break;
                        }
                        else if (nums[i] + nums[j] + nums[s] > target && s == j + 1){
                            cnt += 1;
                            flag = 1;
                            break;
                        }
                        else if (nums[i] + nums[j] + nums[s] < target){
                            break;
                        }
                        else {
                            cnt += 1;
                        }
                    }
                    k = k - cnt;
                }
                //TODO：待确认为啥会有空列表：如果创建了一个空列表并进行了初始化，则该列表长度为0，但是不为null
                if (li.size() != 0){
                    ans.add(li);
                }
                if (flag == 1 || k == j){
                    break;
                }
            }
        }
        return ans;

    }
}
