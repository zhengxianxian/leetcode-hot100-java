package list_node;
import utils.ListNode;
import utils.MakeLinkedList;

public class RemoveNthFromEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = 6;
        MakeLinkedList ml1 = new MakeLinkedList(arr);
        ListNode head = removeNthFromEnd(ml1.head, n);
        ml1.print(head);
    }
    static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode tail = head;
        ListNode pre_delete = head;
        int node_cnt = 0;
        while (tail != null){
            node_cnt += 1;
            tail = tail.next;
        }
        if (node_cnt == 1){
            return null;
        }
        int i = 0;
        int target = node_cnt - n;
        if (target == 0){
            return head.next;
        }
        while (i != target - 1){
            pre_delete = pre_delete.next;
            i += 1;
        }
        ListNode tmp = pre_delete.next.next;
        pre_delete.next = tmp;
        return head;

    }
}
