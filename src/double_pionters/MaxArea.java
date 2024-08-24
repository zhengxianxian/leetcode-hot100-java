package double_pionters;

public class MaxArea {
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    static int maxArea(int[] height){
        int left = 0, right = height.length - 1;
        int max_area = 0;
        while (left < right){
            int area = (right - left) * Math.min(height[left], height[right]);
            max_area = Math.max(max_area, area);
            if (height[left] < height[right]){
                left += 1;
            }
            else{
                right -= 1;
            }
        }
        return max_area;
    }
}
