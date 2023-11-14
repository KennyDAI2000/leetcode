package Linked_List;

public class Remove_Node_End {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        /*两次扫描
        int length = 0;
        while(dummyHead.next != null){
            length++;
            dummyHead = dummyHead.next;
        }
        ListNode dummyHead2 = new ListNode(-1);
        dummyHead2.next = head;
        ListNode cur = dummyHead2;
        for(int i = 0; i <length-n; i++){
            cur = cur.next;
        }
        cur.next=cur.next.next;
        return dummyHead2.next;*/
        ListNode fast = dummyHead;
        ListNode slow = dummyHead;
        for (int i=0; i<n; i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return  dummyHead.next;



    }
}
