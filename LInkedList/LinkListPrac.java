
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkListPrac {

    Node head;
    Node tail;

    public LinkListPrac() {
        head = tail = null;
    }

    void addFirst(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

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

    void popFront() {
        if (head == null) {
            System.out.println("List is All ready empty  ");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    void popBack() {
        if (head == null) {
            System.out.println("List is All Ready Empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }
        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;

    }

    void insert(int val, int pos) {
        if (pos < 0) {
            System.out.println("Invalid Position");
            return;
        }

        if (pos == 0) {
            addFirst(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {

            if (temp == null) {
                System.out.println("Invalid Position !");
                return;
            }
            temp = temp.next;
        }

        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void delete(int val) {

        if (head == null) {
            return;
        }

        // head delete karna ho
        if (head.val == val) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null) {

            if (temp.next.val == val) {
                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }

        System.out.println("Value is not present in the list!");
    }

    int search(int val) {
        Node temp = head;
        int pos = 0;

        while (temp != null) {
            if (temp.val == val) {
                return pos;
            }

            temp = temp.next;
            pos++;
        }

        return -1;
    }

    void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        tail = head;
        head = prev;
    }

    int middle() {

        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.val;
    }

    public static void main(String[] args) {
        // LinkListPrac listPrac = new LinkListPrac();

        // listPrac.addFirst(1);
        // listPrac.addLast(2);
        // listPrac.addLast(3);
        // listPrac.addFirst(0);

        // listPrac.display();

        // LinkListPrac list2 = new LinkListPrac();

        // list2.addFirst(3);

        // list2.display();

        // System.out.println(list2.head.val + " " + list2.tail.val);

        // list2.popFront();

        // list2.display();

        // list2.popFront();

        // LinkListPrac list3 = new LinkListPrac();

        // list3.addFirst(2);
        // list3.addFirst(4);
        // list3.addFirst(5);

        // list3.display();

        // list3.popBack();

        // list3.display();

        // LinkListPrac list4 = new LinkListPrac();

        // list4.addLast(1);
        // list4.addLast(2);
        // list4.addLast(3);
        // list4.addLast(4);
        // list4.addLast(6);
        // list4.addLast(7);

        // list4.display();
        // list4.insert(5, 4);
        // list4.display();

        // list4.insert(0, 0);
        // list4.display();

        // list4.insert(66, 12);

        // int pos = list4.search(5);
        // System.out.println(pos);

        // list4.reverse();

        // list4.display();

        LinkListPrac list5 = new LinkListPrac();

        list5.addLast(1);
        list5.addLast(2);
        list5.addLast(3);
        list5.addLast(4);
        list5.addLast(5);

        list5.display();

        list5.delete(3);
        list5.display();

        int mid = list5.middle();

        System.out.println(mid);
    }
}
