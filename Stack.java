import java.util.*;

public class Stack {
    private final int maxSize;
    private final char[] stackArray;
    private int top;
    
    public Stack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public Stack(int maxSize, char[] stackArray, int top) {
        this.maxSize = maxSize;
        this.stackArray = stackArray;
        this.top = top;
    }
    
    public void push(char j) {
        stackArray[++top] = j;
    }
    
    public char pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }
    
    public char peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public char[] getStackArray() {
        return stackArray;
    }
}
