package matrix;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int matrix[][] = new int[][]{
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        rotate(matrix);
        for (int[] row :matrix){
            System.out.println(Arrays.toString(row));
        }
    }
    static void rotate(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m - 1;
        while (top <= bottom){
            for (int j = 0; j < n; j ++){
                int tmp = matrix[top][j];
                matrix[top][j] = matrix[bottom][j];
                matrix[bottom][j] = tmp;
            }
            top += 1;
            bottom -=1;
        }
        for (int i = 0; i < m; i ++){
            for (int k = 0; k <= i; k ++){
                int tmp = matrix[i][k];
                matrix[i][k] = matrix[k][i];
                matrix[k][i] = tmp;
            }
        }

    }
}
