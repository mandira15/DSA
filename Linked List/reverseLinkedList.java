package LinkedList;
import java.util.*;
public class reverseLinkedList{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next; // Store the next node
            current.next = prev;              // Reverse the current node's pointer
            prev = current;          // Move pointers one position ahead
            current = nextNode;
        }
        // At the end, prev will be the new head of the reversed list
        return prev;
    }
    // Helper method to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        reverseLinkedList obj = new reverseLinkedList();
        ListNode reversedHead = obj.reverseList(head);
        obj.printList(reversedHead); // Should print: 5 -> 4 -> 3 -> 2 -> 1 -> null
    }
}