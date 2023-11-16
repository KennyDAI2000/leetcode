package Linked_List;

public class Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while (cur.next != null && cur.next.next != null){
            ListNode temp1 = cur.next;
            ListNode temp2 = cur.next.next.next;
            cur.next = cur.next.next;
            cur.next.next = temp1;
            cur.next.next.next = temp2;
            cur = cur.next.next;
        }
        return cur;
    }

}


//思路：从前往后提环2个，递归完成
//     1 -> 2 -> 3 -> 4
//     2 -> 1 -> 3 -> 4