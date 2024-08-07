import java.util.EmptyStackException;

class Stackk {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stackk(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stackk is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " to the stack.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            int value = stackArray[top--];
            System.out.println("Popped " + value + " from the stack.");
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stackk stack = new Stackk(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.push(60);

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Top element is: " + stack.peek());
    }
}
