class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
    public static Node ReverseLinkedList(Node head) {
    if(head == null)
    {
        return head;
    }
	 Node cur = head;
     Node prev = null;
    Node next = null;
     while(cur!=null)
     {
         next = cur.next;
         cur.next = prev;
         prev = cur;
         cur = next;
     }
     return prev;

    }