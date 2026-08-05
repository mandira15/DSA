public class removeFromNthNode {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node removeNode(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            if (fast == null) return head.next;
            fast = fast.next;
        }
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        Node temp = slow.next;
        slow.next = slow.next.next;
        temp = null;
        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        int n = 2;
        removeFromNthNode obj = new removeFromNthNode();
        Node head = obj.removeNode(n1, n);
        while(head != null ){
            System.out.print(head.val);
            if(head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
    }
}
