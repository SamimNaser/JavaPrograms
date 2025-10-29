// Program: Circular Queue Implementation Using Arrays  
// Topic: Queue Data Structure  
// Description: Implements a circular queue using an integer array with standard operations — `push()`, `pop()`, and `show()`.  
// Uses modular arithmetic to wrap indices for circular behavior, avoiding wasted space when the rear reaches the end.  
// Demonstrates enqueue and dequeue operations, queue overflow/underflow handling, and element display logic.  
package queue;

/**
 *
 * @author Samim
 */
public class CircularQueue{
    private int[] cq;  // Array to store the integers
    private int cap;   // Maximum capacity of the array
    private int front; // Index pointing to the front end
    private int rear;  // Index pointing to the rear end

    // Constructor to initialize the data members
    public CircularQueue(int max) {
        cap = max;        // Set the maximum capacity
        cq = new int[cap];  // Initialize the array with the given capacity
        front = -1;       // Initialize front to -1 (queue is empty)
        rear = -1;        // Initialize rear to -1 (queue is empty)
    }

    // Function to add an integer to the queue from the rear end
    public void push(int n) {
        if ((rear + 1) % cap == front) {  // Check if the queue is full
            System.out.println("QUEUE IS FULL");
        } else {
            if (front == -1) {
                // Queue is empty
                front = 0;
            }
            rear = (rear + 1) % cap;  // Update rear in circular manner
            cq[rear] = n;             // Insert the element at the rear
        }
    }

    // Function to remove and return the integer from the front end of the queue
    public int pop() {
        if (front == -1) {  // Check if the queue is empty
            System.out.println("QUEUE IS EMPTY");
            return -9999;  // Return -9999 if the queue is empty
        } else {
            int temp = cq[front];  // Get the element from the front
            if (front == rear) {
                // Only one element was present, now the queue will be empty
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % cap;  // Update front in circular manner
            }
            return temp;  // Return the removed element
        }
    }

    // Function to display the elements of the queue
    public void show() {
        if (front == -1) {
            System.out.println("QUEUE IS EMPTY");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;
        while (i != rear) {
            System.out.print(cq[i] + " ");
            i = (i + 1) % cap;
        }
        System.out.println(cq[rear]);  // Print the last element at rear
    }

    // Main function to test the class
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);  // Create a circular queue of capacity 5

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);  // Queue should be full now

        queue.show();  // Display the queue

        System.out.println("Popped: " + queue.pop());  // Remove an element
        queue.show();  // Display the queue after removing an element

        queue.push(60);  // Add a new element, should work because of circular nature
        queue.show();  // Display the updated queue

        System.out.println("Popped: " + queue.pop());  // Remove another element
        queue.show();  // Display the queue
    }
}
