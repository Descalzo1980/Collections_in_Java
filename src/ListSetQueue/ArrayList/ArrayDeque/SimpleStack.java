package ListSetQueue.ArrayList.ArrayDeque;

public class SimpleStack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public SimpleStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long element) {
        stackArray[++top] = element;
    }

    public long pop() {
        return stackArray[top--];
    }


    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

class StackMain{
    public static void main(String[] args) {
        SimpleStack simpleStack = new SimpleStack(10);
        simpleStack.push(10);
        simpleStack.push(20);
        simpleStack.push(30);
        simpleStack.pop();
        simpleStack.peek();
        simpleStack.isEmpty();

        while (!simpleStack.isEmpty()){
            long popElement = simpleStack.pop();
            System.out.println(popElement + " ");
        }
    }
}
