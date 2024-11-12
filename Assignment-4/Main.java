// Design an interface named Queue with the following methods:
// a) To insert() and delete() elements from the Queue.
// b) display() to display the content of the modified Queue.

interface CustomQueue {
    void insert(int element);
    int delete();
    void display();
}

class Operation implements CustomQueue {
    int MAX = 100;
    int[] data = new int[MAX];
    int front = -1;
    int rear = -1;

    public void insert(int element) {
        if (rear == MAX - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1)
            front = 0;
        rear++;
        data[rear] = element;
    }

    public int delete() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = data[front];
        front++;
        if (front > rear) {
            front = rear = -1;
        }
        return value;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        CustomQueue q = new Operation();
        q.delete(); // Queue is empty
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.display(); // Queue elements: 10 20 30 40 50
        q.delete();
        q.display(); // Queue elements: 20 30 40 50
    }
}
