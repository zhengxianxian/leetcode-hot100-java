package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<int[]> li = new ArrayList<>();
        li.add(new int[]{1, 2});
        li.add(new int[]{3});
        li.add(new int[]{4,5});
        System.out.println(Arrays.toString(li.get(1)));
    }


}
