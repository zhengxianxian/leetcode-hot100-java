package list_node;
import utils.ListNode;
import utils.MakeLinkedList;

import java.util.HashMap;
import java.util.HashSet;

public class GetIntersectionNode {
    public static void main(String[] args) {
        int[] nums1 = {4,1,8,4,5};
        int[] nums2 = {5,6,1,8,4,5};
        MakeLinkedList ml = new MakeLinkedList(nums1);
        //TODO: 链表A：由数组生成
        ListNode headA = ml.head;
//        ml.print(headA);
        //TODO: 链表B：写死
        ListNode headB = new ListNode(nums2[0]);
        ListNode tail0 = new ListNode(nums2[1]);
        headB.next = tail0;
        ListNode tail1 = new ListNode(nums2[2]);
        tail0.next = tail1;
        tail1.next = headA.next.next;

        ListNode ans = getIntersectionNode(headA, headB);
        System.out.println(ans.val);

    }
    static ListNode getIntersectionNode (ListNode headA, ListNode headB){
        HashSet<ListNode> set = new HashSet<>();
        while (headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null){
            if (set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}

