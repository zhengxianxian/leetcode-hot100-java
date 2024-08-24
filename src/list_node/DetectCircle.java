package list_node;
import utils.ListNode;

import java.util.HashSet;

public class DetectCircle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(0);
//        ListNode tail = new ListNode(4);
//        head.next.next.next = tail;
//        tail.next = head.next;

        System.out.println(detectCircle(head));
    }
    static ListNode detectCircle(ListNode head){
        HashSet<ListNode> set = new HashSet<>();
        ListNode ans = null;
        while (head != null){
            if (!set.contains(head)){
                set.add(head);
                head = head.next;
            }
            else{
                ans = head;
                break;
            }

        }
        return ans;
    }
}
