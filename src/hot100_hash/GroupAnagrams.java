package hot100_hash;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = groupAnagrams(strs);
        for(List<String> res : ans){
            for(String ss : res){
                System.out.print(ss + " ");
            }
            System.out.println("-----------");
        }
    }
    static List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        for(String s : strs){
            String word = sort(s);
            if (mp.containsKey(word)){
                List<String> tmp = mp.get(word);
                tmp.add(s);
                mp.put(word, tmp);
            }
            else{
                List<String> tmp = new ArrayList<>();
                tmp.add(s);
                mp.put(word,tmp);
            }
        }
        for(String key: mp.keySet()){
            ans.add(mp.get(key));
        }
        return ans;
    }
    //TODO: 对字符串按照字典序排序
    static String sort(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String word = new String(chars);
        return word;
    }

}
