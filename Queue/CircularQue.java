class CircularQueue {
    private int cap;
    private int currSize;
    private int front;
    private int rear;
    private int[] arr;

    CircularQueue(int cap) {
        this.cap = cap;
        arr = new int[cap];
        front = 0;
        rear = -1;
        currSize = 0;
    }

    void push(int data) {
        if (currSize == cap) {
            System.out.println("Queue is already Full!");
            return;
        }
        rear = (rear + 1) % cap;
        arr[rear] = data;
        currSize++;
    }

    void pop() {
        if (empty()) {
            System.out.println("Queue is already Empty!");
            return;
        }
        System.out.println("Removed: " + arr[front]);
        front = (front + 1) % cap;
        currSize--;
    }

    int front() {
        if (empty()) return -1;
        return arr[front];
    }

    int rear() {
        if (empty()) return -1;
        return arr[rear];
    }

    boolean empty() {
        return currSize == 0;
    }

    int getCurrSize() {
        return currSize;
    }
}


public class CircularQue {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(4);

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        q.pop();
        q.pop();

        System.out.println("Front: " + q.front());
        System.out.println("Rear: " + q.rear());
        System.out.println("Current Size: " + q.getCurrSize());
    }
}
