package list_node;
import utils.ListNode;
import utils.MakeLinkedList;

import java.util.ArrayList;
import java.util.List;

public class AddTwoLists {
    //TODO：确认能否用Collection接口中的LinkedList类直接创建链表并解决问题
    //TODO：转为整数再相加，使用int类型会出现溢出，而如果改为其他类型会影响其他代码
        //使用进位，直接创建list
    public static void main(String[] args) {
        int[] arr1 = new int[]{0};
        int[] arr2 = new int[]{9};

        MakeLinkedList ml1 = new MakeLinkedList(arr1);
        MakeLinkedList ml2 = new MakeLinkedList(arr2);

        ListNode ans = addTwoLists(ml1.head, ml2.head);
        ml1.print(ans);
    }

    static ListNode addTwoLists(ListNode l1, ListNode l2){
        ListNode t1 = l1;
        ListNode t2 = l2;
//        Step1: 先补0使位数一致
        while (t1.next != null || t2.next != null){
            if (t1.next == null){
                ListNode node1 = new ListNode(0);
                t1.next = node1;
                t1 = t1.next;
                t2 = t2.next;
            }
            else if (t2.next == null){
                ListNode node2 = new ListNode(0);
                t2.next = node2;
                t2 = t2.next;
                t1 = t1.next;
            }
            else{
                t1 = t1.next;
                t2 = t2.next;
            }
        }

//        STEP2: 逐位计算和, 首先默认进位为0, 对链表的头节点初始化
        int carry = 0;
        ListNode head;
        int tmp = l1.val + l2.val + carry;
        if (tmp < 10){
            ListNode node = new ListNode(tmp);
            head = node;
        }
        else{
            carry = 1;
            ListNode node = new ListNode(tmp - 10);
            head = node;
        }
        ListNode tail = head;
        l1 = l1.next;
        l2 = l2.next;


        while (l1 != null){
            int tmp0 = l1.val + l2.val + carry;
            if (tmp0 < 10){
                ListNode node0 = new ListNode(tmp0);
                carry = 0;
                tail.next = node0;
                tail = tail.next;
            }
            else{
                ListNode node0 = new ListNode(tmp0-10);
                carry = 1;
                tail.next = node0;
                tail = tail.next;
            }
            l1 = l1.next;
            l2 = l2.next;

        }
        if (carry == 1){
            tail.next = new ListNode(1);
        }
        return head;
    }

}
