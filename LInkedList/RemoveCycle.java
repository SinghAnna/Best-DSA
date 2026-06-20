
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}


public class RemoveCycle {

    
    static void deleteCycle(Node head) {

    Node slow = head;
    Node fast = head;
    boolean cycle = false;

    // Detect cycle
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            cycle = true;
            break;
        }
    }

    if (!cycle) {
        System.out.println("Cycle is not Exist");
        return;
    }

    // Find cycle starting node
    slow = head;
    Node prev = null;

    while (slow != fast) {
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }

    // Remove cycle
    prev.next = null;
}

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }

    public static void main(String[] args) {
    
        Node head = new Node(1);
    
        head.next = new Node(2);

        head.next.next = new Node(  3);
         
        head.next.next.next = new Node(4);

        head.next.next.next.next = head.next;

        


        
        deleteCycle(head);
        
        display(head);
    }
}
