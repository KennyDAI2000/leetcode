package Linked_List;
import org.junit.Test;
public class Reverse_Link_List {
    @Test
    public void test(){
        //{1,2,6,3,4,5,6}
        int[] values = {1,2,6,3,4,5};
        ListNode dummyHead = new ListNode(-1);
        ListNode tail = dummyHead;

        for (int value : values){
            tail.next = new ListNode(value);
            tail = tail.next;
        }
        ListNode head = dummyHead.next;

    }
    /* 双指针法
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }*/

    //递归法
    public ListNode reverseList(ListNode head) {
        return reverse(null, head);


    }
    private ListNode reverse(ListNode pre, ListNode cur){
        if(cur == null){
            return pre;
        }
        ListNode temp = cur.next;
        cur.next = pre;
        return reverse(cur, temp);
    };



}

//思考：


//题解：通过双指针，cur初始化为head，pre初始化为null，利用临时变量temp储存cur.next，cur.next指向pre