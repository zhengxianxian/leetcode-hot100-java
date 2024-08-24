package slide_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(Arrays.toString(findAnagrams(s,p).toArray()));
    }
    static List<Integer> findAnagrams(String s, String p){
        int m = s.length();
        int n = p.length();
        int[] s_cnt = new int[26];
        int[] p_cnt = new int[26];

        List<Integer> ans = new ArrayList<>();
        if(m < n){
            return new ArrayList<>();
        }
        for (int i = 0; i < n; i++){
            s_cnt[s.charAt(i) - (int) 'a'] += 1;
            p_cnt[p.charAt(i) - (int) 'a'] += 1;
        }
//        System.out.println(Arrays.toString(s_cnt));
//        System.out.println(Arrays.toString(p_cnt));

        if (Arrays.equals(s_cnt,p_cnt)){
            ans.add(0);
        }

        for (int i = 1; i < m - n + 1; i ++){
            s_cnt[s.charAt(i-1)-(int)'a'] -= 1;
            s_cnt[s.charAt(i + n - 1) - (int)'a'] += 1;
            if (Arrays.equals(s_cnt,p_cnt)){
                ans.add(i);
            }
        }
        return ans;
    }
}
