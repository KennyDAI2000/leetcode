package Linked_List;

class MyLinkedList {
    int size;
    ListNode dummyHead;
    public MyLinkedList() {
        size = 0;
        dummyHead = new ListNode(0);
    }

    public int get(int index) {
        if(index<0 ||index >= size){
            return -1;
        }
        ListNode cur = dummyHead;
        for (int i = 0; i < index; i++){
            cur = cur.next;
        }
        return cur.next.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if(index > size){
            return;
        }
        if (index < 0) {
            index = 0;
        }
        ListNode cur = dummyHead;
        for (int i = 0; i < index; i ++){
            cur = cur.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = cur.next;
        cur.next = toAdd;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index>=size || index<0){
            return;
        }
        ListNode cur = dummyHead;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size --;
    }
}