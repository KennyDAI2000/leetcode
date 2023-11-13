package Linked_List;
import org.junit.Test;

import java.util.Arrays;

public class Remove_Element {
    @Test
    public void test(){
        //{1,2,6,3,4,5,6}
        int[] values = {1,2,6,3,4,5,6};
        ListNode dummyHead = new ListNode(-1);
        ListNode tail = dummyHead;

        for (int value : values){
            tail.next = new ListNode(value);
            tail = tail.next;
        }
        ListNode head = dummyHead.next;
        System.out.println(head.next.val);
    }

    // 正常移除，考虑head为空情况
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        if(head == null){
            return head;
        }

        ListNode current = head;
        while (current.next != null){
            if(current.next.val == val){
            current.next = current.next.next;
            }else {
                current = current.next;
            }
        }

        return head;
    }

    // 设置dummy head
    public ListNode removeElementsDummyHead(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1,head);
        ListNode current = dummyHead;
        while (current.next != null){
            if(current.next.val==val){
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return  dummyHead.next;
    }
}




