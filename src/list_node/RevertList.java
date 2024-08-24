package list_node;
import utils.ListNode;
import utils.MakeLinkedList;

import java.util.ArrayList;
import java.util.List;

public class RevertList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        MakeLinkedList ml = new MakeLinkedList(arr);
        ListNode head = ml.head;
        ListNode newHead = revert(head);
        ml.print(newHead);
    }
    static ListNode revert(ListNode head){
        if (head == null){
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur.next != null){
            ListNode post = cur.next;
            cur.next = pre;
            pre = cur;
            cur = post;
        }
        cur.next = pre;
        return cur;
    }

}
