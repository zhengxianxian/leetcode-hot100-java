package utils;

import java.util.ArrayList;
import java.util.List;

public class MakeLinkedList{
    public ListNode head;
    public MakeLinkedList(int[] arr){
        ArrayToLinkedList al = new ArrayToLinkedList(arr);
//        al.print(al.head);
        this.head = al.head;
    }
    public void print(ListNode head){
        List<Integer> list = new ArrayList<>();
        ListNode tail = head;
        while (tail != null){
            list.add(tail.val);
            tail = tail.next;
        }
        for (Integer num: list){
            System.out.println(num + " ");
        }
    }
}

class ArrayToLinkedList{
    ListNode head;
    public ArrayToLinkedList(int[] arr){
        if (arr.length == 0){
            return;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode tail = head;
        for (int i = 1; i < arr.length; i++){
            ListNode node = new ListNode(arr[i]);
            tail.next = node;
            tail = tail.next;
        }
        this.head = head;
    }
}
