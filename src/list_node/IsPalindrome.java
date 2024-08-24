package list_node;
import utils.ListNode;
import utils.MakeLinkedList;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {
    public static void main(String[] args) {
        int[] arr = new int[]{1};
        MakeLinkedList ml = new MakeLinkedList(arr);
        ListNode head = ml.head;
        System.out.println(isPalindrome(head));
    }
    static boolean isPalindrome(ListNode head){
        List<Integer> list = new ArrayList<>();
        if (head == null){
            return false;
        }
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        int n = list.size();
        int left = 0, right = n-1;
        while (left <= right){
            if (list.get(left) != list.get(right)){
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }

}
