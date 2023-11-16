package Linked_List;



public class Linked_List_Cycle {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }


        ListNode startX = head;
        while (startX.next != fast.next){
            startX = startX.next;
            fast = fast.next;
        }
        return startX;

    }
}

//
//
