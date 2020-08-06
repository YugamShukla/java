public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void Display(ListNode head) {
        ListNode current = head;
        if (head == null) {
            System.out.println("No value in the list");
        } else {
            while (current != null) {
                System.out.println(current.data + "--->");
                current = current.next;
            }
            System.out.println(current);
        }
    }

    public int length(ListNode head) {
        ListNode current = head;
        int count = 0;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;

    }
    public ListNode insertNodeAtBeginning(ListNode head,int data){
        ListNode newNode= new ListNode(data);
        if(head==null){
            return newNode;
        }
        newNode.next=head;
        head=newNode;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        SinglyLinkedList singlelinkedlist = new SinglyLinkedList();
        singlelinkedlist.Display(head);
        System.out.println("Length of the node is " + singlelinkedlist.length(head));
        ListNode newHead= singlelinkedlist.insertNodeAtBeginning(head, 60);
        singlelinkedlist.Display(newHead);
        System.out.println("Length of the node is " + singlelinkedlist.length(newHead));

    }
}