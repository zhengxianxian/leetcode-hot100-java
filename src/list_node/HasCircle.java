package list_node;
import utils.ListNode;
import utils.MakeLinkedList;

public class HasCircle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
//        ListNode node2 = new ListNode(0);
//        node1.next = node2;
//        ListNode node3 = new ListNode(4);
//        node2.next = node3;
//        node3.next = node1;

        System.out.println(hasCircle(head));

    }
    static boolean hasCircle(ListNode head){
        ListNode slow = head, fast = head;
        while (fast.next != null){
            if (fast.next.next == null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }

        }
        return false;
    }
}
