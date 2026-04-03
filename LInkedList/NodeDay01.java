class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {

    Node head;
    Node tail;

    // Insert at beginning
    void insertAtFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Insert at tail
    void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Insert at position (1-based index)
    void insertAtPosition(int pos, int data) {

        if (pos <= 0) {
            System.out.println("Invalid Position!");
            return;
        }

        if (pos == 1) {
            insertAtFirst(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid Position!");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position!");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;

        // update tail if inserted at last
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Print list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class NodeDay01 {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtTail(9);
        list.insertAtTail(10);
        list.insertAtTail(20);

        list.insertAtFirst(11);
        list.insertAtFirst(15);

        list.printList();

        list.insertAtPosition(1, 90);   // at head
        list.insertAtPosition(4, 100);  // middle
        list.insertAtPosition(7, 200);  // tail

        list.printList();
    }
}
