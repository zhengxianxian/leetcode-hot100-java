package matrix;

import java.util.Arrays;

public class SetZeroes {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,2,3},
                {1,0,1},
                {1,2,0}
        };
        setZeroes(matrix);
        for (int[] arr : matrix){
            System.out.println(Arrays.toString(arr));
        }
    }
    static void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
//        System.out.println(Arrays.toString(row)); 初始化的默认值为0
        for (int i = 0; i < m; i ++){
            for (int j = 0; j < n; j ++){
                if (matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i ++){
            if (row[i] == 1){
                for (int j = 0; j < n; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < n; j++){
            if (col[j] == 1 ){
                for(int i = 0; i < m; i ++){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
