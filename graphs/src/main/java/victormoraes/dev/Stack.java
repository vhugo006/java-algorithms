package victormoraes.dev;

/**
 * Stack is a linear data structure that stores the elements in a sequential manner following
 * the approach LIFO for access the elements, i.e. the last element inserted is the one that comes out
 * first.
 */
public class Stack<T> {
    private final int maxSize;
    private int top;
    private final T[] arr;

    @SuppressWarnings("unchecked")
    public Stack(int max_size) {
        this.maxSize = max_size;
        this.top = -1; //initially when stack is empty
        arr = (T[]) new Object[max_size];//type casting Object[] to V[]
    }

    /**
     * Returns the element at the top (i.e., the one added most recently)
     */
    public T top() {
        if (isEmpty()) return null;
        return arr[top];
    }

    /**
     * Inserts an element at the top
     */
    public void push(T value) {
        if (isFull()) {
            System.err.println("Stack is Full!");
            return;
        }
        arr[++top] = value;
    }

    /**
     * Removes an element from the top and returns it
     */
    public T pop() {
        if (isEmpty()) {
            System.err.println("Stack is Empty!");
            return null;
        }
        return arr[top--];
    }

    public int getCapacity() {
        return maxSize;
    }

    //returns the maximum size capacity
    public int getMaxSize() {
        return maxSize;
    }

    /**
     * Returns true if the stack is empty and false otherwise
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Returns true if the stack is full and false otherwise
     */
    public boolean isFull() {
        return top == maxSize - 1;
    }
}
