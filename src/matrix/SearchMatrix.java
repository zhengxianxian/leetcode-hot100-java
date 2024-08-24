package matrix;

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target = 27;
        System.out.println(searchMatrix(matrix, target));
    }
    static boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = n-1;
        while (i < m && j >= 0){
            int compare = matrix[i][j];
            if (target < compare){
                j -=1;
            }
            else if (target > compare){
                i +=1;
            }
            else{
                return true;
            }
        }
        return false;


    }
}
