// Create a class Stack and implement push() and pop() operations.

public class Stack {
    private int[] stackArray;  // Array to store stack elements
    private int top;           // Points to the top of the stack
    private int capacity;      // Maximum size of the stack

    public Stack(int size) {
        stackArray = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed onto the stack.");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop() + " popped from the stack.");
        System.out.println(stack.pop() + " popped from the stack.");
        
        stack.push(40);
        System.out.println(stack.pop() + " popped from the stack.");
    }
}