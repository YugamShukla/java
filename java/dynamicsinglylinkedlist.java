
import java.util.Scanner;

public class dynamicsinglylinkedlist {

    private ListNode head;

    private static class ListNode {
        private final int data;
        private ListNode next;

        public ListNode(final int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(final ListNode head) {
        ListNode current = head;
        if (current == null) {
            System.out.print("No value in the list");
        } else {
            while (current != null) {
                final var counter = current;
                System.out.println(counter);
                System.out.println(current.data + "--->");
                current = current.next;
            }
        }
    }

    public int length(final ListNode head) {
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

    public ListNode insertAtBeginning(ListNode head, final int data) {
        final ListNode newNode = new ListNode(data);
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }
    public void insertanywhere(ListNode previous, int data){
        if(previous==null){
            System.out.println("Node cannot be null");
        }
        ListNode newNode= new ListNode(data); 
        newNode.next=previous.next;
        previous.next=newNode;
    }

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number of the node");
        final var a = sc.nextInt();
        System.out.println("Enter 2nd number of the node");
        final var b = sc.nextInt();
        System.out.println("Enter 3rd number of the node");
        final var c = sc.nextInt();
        System.out.println("Enter 4th number of the node");
        final var d = sc.nextInt();
        System.out.println("Enter 5th number of the node");
        final var e = sc.nextInt();
        System.out.println("enter the value of node to be inserted at the beginning");
        final int f = sc.nextInt();
        final ListNode head = new ListNode(a);
        final ListNode second = new ListNode(b);
        final ListNode third = new ListNode(c);
        final ListNode fourth = new ListNode(d);
        final ListNode fifth = new ListNode(e);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        final dynamicsinglylinkedlist single = new dynamicsinglylinkedlist();
        single.display(head);
        System.out.println("lenth of the list is " + single.length(head));
        ListNode newHead = single.insertAtBeginning(head, f);
        single.display(newHead);
        System.out.println("lenth of the list is " + single.length(newHead));
        single.insertanywhere(second, f);
        single.display(head);
    }
}