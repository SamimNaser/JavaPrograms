// Program: Queue Implementation Using Arrays  
// Topic: Queue Data Structure  
// Description: Implements a linear queue using an integer array with basic operations — `enqueue()`, `dequeue()`, and `peek()`.  
// Demonstrates queue behavior (FIFO – First In, First Out) using circular indexing with modulo arithmetic to optimize space.  
// Includes boundary checks to prevent overflow and underflow, and provides a simple test in the `main()` method.  
package queue;
/**
 *
 * @author Samim
 */
public class QueueBasic {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    public QueueBasic(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
        this.front = 0;
       
          
        this.size = 0;
    }

    public void enqueue(int data) {
        if (!isFull()) {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = data;
            size++;
        } else {
            System.out.println("Queue is full. Cannot enqueue " + data);
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int data = queueArray[front];
            front = (front + 1) % maxSize;
            //System.out.println(front);
            size--;
            return data;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public static void main(String[] args) {
        QueueBasic queue = new QueueBasic(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Peek: " + queue.peek());
        //System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeue: " + queue.dequeue());
        queue.enqueue(60); // This will cause overflow
        System.out.println("Peek: " + queue.peek());
    }
}
