package slide_window;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int ans = 1;
        int left = 0, right = 0;
        StringBuilder sb = new StringBuilder();
        while (right < n){
            char c = s.charAt(right);
            String s0 = String.valueOf(c);
            String tmp = sb.toString();
            if (tmp.contains(s0)){
                while (left < right){
                    if (s.charAt(left) == s.charAt(right)){
                        break;
                    }
                    left += 1;
                }
                left += 1;
                sb = new StringBuilder(s.substring(left, right + 1));

            }
            else{
                sb.append(s.charAt(right));
            }
            right += 1;
            ans = Math.max(ans, sb.length());
        }
        return ans;

    }
}
