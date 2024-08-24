package double_pionters;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = new int[] {1,0,2,3,0,0,3,0};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void moveZeros(int[] nums){
        int n = nums.length;
        int left = 0, right = 0;
        while (right < n){
            if(nums[right] != 0) {
                int tmp;
                tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left += 1;
                right += 1;
            }
            else{
                right += 1;
            }

        }

    }
}
