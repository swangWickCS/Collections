import java.util.NoSuchElementException;

/**
 * A queue of ints stored in a circular array.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class myQueue {
    private int[] arr; // has one extra slot so a full queue looks different from an empty one
    private int front; // index of the front element
    private int back; // index of the back element

    /**
     * Constructs a queue that can hold 100 elements.
     */
    public myQueue() {
        arr = new int[100 + 1];
        front = 0;
        back = -1;
    }

    /**
     * Constructs a queue that can hold maxSize elements.
     *
     * @param maxSize the maximum number of elements the queue can hold
     */
    public myQueue(int maxSize) {
        arr = new int[maxSize + 1];
        front = 0;
        back = -1;
    }

    /**
     * Adds an element to the back of the queue.
     *
     * @param element the element to add to the back of the queue
     * @throws IllegalStateException if the queue is full
     */
    public void enqueue(int element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        back = (back + 1) % arr.length;
        arr[back] = element;
    }

    /**
     * Removes an element from the front of the queue.
     *
     * @return the element that was at the front of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int temp = arr[front];
        arr[front] = 0;
        front = (front + 1) % arr.length;

        return temp;
    }

    /**
     * Reads the element at the front of the queue without removing it.
     *
     * @return the element at the front of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public int front() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return arr[front];
    }

    /**
     * Indicates whether the queue contains any elements.
     *
     * @return true if the queue has no elements, false otherwise
     */
    public boolean isEmpty() {
        return (back + 1) % arr.length == front;
    }

    /**
     * Indicates whether the queue has exhausted its available storage.
     *
     * @return true if the queue has no room left, false otherwise
     */
    public boolean isFull() {
        return (back + 2) % arr.length == front;
    }

    /**
     * Returns the number of elements stored in the queue.
     *
     * @return the number of elements in the queue
     */
    public int size() {
        return (back - front + 1 + arr.length) % arr.length;
    }

    /**
     * Returns the contents of the queue from front to back.
     *
     * @return the elements of the queue as a string, starting with the front
     */
    public String toString() {
        String str = "";

        for (int i = 0; i < this.size(); i++) {
            str += arr[(front + i) % arr.length] + " ";
        }

        return str;
    }
}