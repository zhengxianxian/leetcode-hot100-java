package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{
                {1, 3},
                {8, 10},
                {2, 6},
                {15, 18}
        };
        int[][] ans = merge(intervals);
        for (int[] arr: ans){
            System.out.println(Arrays.toString(arr) + " ");
        }
    }
    static int[][] merge(int[][] intervals){
        //TODO: 编程实现比较
        sort(intervals);

        List<int[]> ans = new ArrayList<>();
        int m = intervals.length;
        ans.add(intervals[0]);

        for (int i = 1; i < m; i ++){
            int p = ans.size();
            int[] left = ans.get(p-1);
            int[] right = intervals[i];

            if (left[1] < right[0]){
                ans.add(right);
            }
            else{
                if (left[1] <= right[1]){
                    ans.remove(p-1);
                    ans.add(new int[]{left[0], right[1]});
                }
                else{
                    continue;
                }
            }
        }
        return ans.toArray(new int[ans.size()][2]);
    }
    static void sort(int[][] intervals){
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
    }
}
