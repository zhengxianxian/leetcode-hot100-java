package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
//                {13,14,15,16},
//                {17,18,19,20},
//                {21,22,23,24}
        };
        List<Integer> ans = spiralOrder(matrix);
        System.out.println(Arrays.toString(ans.toArray()));
    }

    static List<Integer> spiralOrder(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int cnt = 0;
        while (ans.size() < m * n){
            int i = cnt;
            for (int a = cnt; a < n - cnt; a ++){
                ans.add(matrix[i][a]);
                if (ans.size() == m*n){
                    return ans;
                }
            }
            int j = n - cnt - 1;
            for (int b = cnt + 1; b < m - cnt; b++){
                ans.add(matrix[b][j]);
                if (ans.size() == m*n){
                    return ans;
                }
            }
            int p = m - cnt - 1;
            for (int c = n - cnt - 2; c >= cnt; c--){
                ans.add(matrix[p][c]);
                if (ans.size() == m*n){
                    return ans;
                }
            }
            int q = cnt;
            for (int d = m - cnt - 2; d > q; d--){
                ans.add(matrix[d][q]);
                if (ans.size() == m*n){
                    return ans;
                }
            }
            cnt += 1;
        }
        return ans;

    }



}
