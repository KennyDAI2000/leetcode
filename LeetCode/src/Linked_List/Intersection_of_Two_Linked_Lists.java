package Linked_List;

public class Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummyHeadA = new ListNode(-1);
        dummyHeadA.next = headA;
        ListNode dummyHeadB = new ListNode(-1);
        dummyHeadB.next = headB;
        int lengthA = findLength(headA);
        int lengthB = findLength(headB);
        ListNode fast, slow;

        if (lengthA >= lengthB){
            fast = dummyHeadA;
            slow = dummyHeadB;
        }else {
            slow = dummyHeadA;
            fast = dummyHeadB;
        }
        for(int i=0; i<Math.abs((lengthA-lengthB)); i++){
            fast = fast.next;
        }
        while(fast.next!=slow.next){
            fast = fast.next;
            slow = slow.next;
        }
        return fast.next;

    }

    private int findLength(ListNode head){
        int length = 0;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while (cur.next != null){
            length++;
            cur = cur.next;
        }
        return length;
    }

}
