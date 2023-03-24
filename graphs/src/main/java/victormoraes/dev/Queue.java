package victormoraes.dev;

/**
 * Queue is a linear data structure that stores the elements in a sequential manner following
 * the approach FIFO for access the elements, i.e. the first element inserted is the one that comes out
 * first.
 */
public class Queue<T> {

    private final int maxSize;
    private final T[] array;
    private int front;
    private int back;
    private int currentSize;

    @SuppressWarnings("unchecked")
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        array = (T[]) new Object[maxSize];
        front = 0;
        back = -1;
        currentSize = 0;
    }


    /*dequeue 	Removes an element from the start of the queue*/
    /*top 	Returns the first element of the queue*/
    /*isEmpty 	Checks if the queue is empty*/
    /*isFull 	Checks if the queue is full*/

    /**
     * Inserts element to the end of the queue
     */
    public void enqueue(T value) {
        if (isFull())
            return;
        back = (back + 1) % maxSize; //to keep the index in range
        array[back] = value;
        currentSize++;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public T top() {
        return array[front];
    }


    public T dequeue() {
        if (isEmpty())
            return null;

        T temp = array[front];
        front = (front + 1) % maxSize; //to keep the index in range
        currentSize--;

        return temp;
    }
}