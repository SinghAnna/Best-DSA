class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Merge2SortedList {

    Node head;
    Node tail;

    public Merge2SortedList() {
        head = tail = null;
    }

    void addLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }

    static Node mergeTwoList(Node l1, Node l2) {

        if (l1 == null || l2 == null) {
            return (l1 == null) ? l2 : l1;
        }

        if (l1.val <= l2.val) {
            l1.next = mergeTwoList(l1.next, l2);
            return l1;
        } else {

            l2.next = mergeTwoList(l1, l2.next);
            return l2;
        }

    }

   static Node mergeTwoListItrative(Node l1, Node l2) {

    Node dummy = new Node(-1);
    Node curr = dummy;

    while (l1 != null && l2 != null) {

        if (l1.val <= l2.val) {
            curr.next = l1;
            l1 = l1.next;
        } else {
            curr.next = l2;
            l2 = l2.next;
        }

        curr = curr.next;
    }

    if (l1 != null) {
        curr.next = l1;
    } else {
        curr.next = l2;
    }

    return dummy.next;
}

    public static void main(String[] args) {

       Merge2SortedList list1 = new Merge2SortedList();
Merge2SortedList list2 = new Merge2SortedList();

list1.addLast(1);
list1.addLast(3);
list1.addLast(5);

list2.addLast(2);
list2.addLast(3);
list2.addLast(6);

list1.display();
list2.display();
Node mergedHead = mergeTwoList(list1.head, list2.head);

Node temp = mergedHead;

while (temp != null) {
    System.out.print(temp.val + " -> ");
    temp = temp.next;
}
System.out.println("NULL");

Merge2SortedList list3 = new Merge2SortedList();
Merge2SortedList list4 = new Merge2SortedList();

list3.addLast(11);
list3.addLast(23);
list3.addLast(57);

list4.addLast(22);
list4.addLast(33);
list4.addLast(66);

list3.display();
list4.display();

Node mergedHead2 = mergeTwoListItrative(list3.head, list4.head);



Node temp2 = mergedHead2;

while (temp2 != null) {
    System.out.print(temp2.val + " -> ");
    temp2= temp2.next;
}
System.out.println("NULL");

    }
}
