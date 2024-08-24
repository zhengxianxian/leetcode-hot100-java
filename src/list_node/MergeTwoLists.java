package list_node;
import utils.ListNode;
import utils.MakeLinkedList;

public class MergeTwoLists {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,5,9};
        int[] arr2 = new int[]{10,11};

        MakeLinkedList ml1 = new MakeLinkedList(arr1);
        MakeLinkedList ml2 = new MakeLinkedList(arr2);
        ListNode headA = ml1.head;
        ListNode headB = ml2.head;

        ListNode head = mergeTwoLists(headA, headB);
        ml1.print(head);

    }
    static ListNode mergeTwoLists(ListNode headA, ListNode headB){
        if (headA == null){
            return headB;
        }
        if (headB == null){
            return headA;
        }

        ListNode ans;
        if (headA.val <= headB.val){
            ans = insert(headA, headB);
        }
        else{
            ans = insert(headB, headA);
        }
        return ans;

    }
    //TODO:
    static ListNode insert (ListNode headA, ListNode headB){
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != null && curB != null){
            if (curA.next == null){
                curA.next = curB;
                break;
            }
            if (curA.val <= curB.val && curB.val <= curA.next.val){
                ListNode postA = curA.next;
                ListNode postB = curB.next;
                curA.next = curB;
                curB.next = postA;
                curA = curA.next;
                curB = postB;
                if (curB == null){
                    break;
                }
            }
            else{
                curA = curA.next;
            }
        }
        return headA;

    }

}
