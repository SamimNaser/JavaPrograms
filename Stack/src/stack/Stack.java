// Program: Stack Implementation Using Arrays  
// Topic: Stack Data Structure  
// Description: Implements a stack using an integer array with basic operations — `push()`, `pop()`, and `peek()`.  
// Includes utility methods `isEmpty()` and `isFull()` to check stack conditions and prevent underflow or overflow.  
// Demonstrates stack behavior (LIFO – Last In, First Out) and performs sample push operations in the `main()` method.  
package stack;

/**
 *
 * @author Samim    
 */
public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        top++;
        stackArray[top] = value;    
    }

    public int pop() {
        
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int value = stackArray[top];
        top--;
        return value;
    }

     public int peek() {
         
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args){
        //The no of input defines which method will be invoked
        
        Stack stack =new Stack(10);
        stack.push(50);
        stack.push(70);
//        System.out.println("Peek: " + stack.peek());
//        System.out.println("Pop: " + stack.pop());
//        System.out.println("Peek: " + stack.peek());
        stack.push(40);
        stack.push(50);
        stack.push(60); // This will cause overflow
    }
}
    
    

