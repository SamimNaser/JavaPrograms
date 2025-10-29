// Program: Traverse and Display a Singly Linked List  
// Topic: Linked List and Traversal  
// Description: Implements insertion and traversal operations in a singly linked list.  
// The `Traverse` class extends `Node` and allows adding new nodes at the end of the list using the `insert()` method.  
// It provides two display methods, `Traverse()` and `Display()`, to print the list in formatted output.  
// The `TraverseTest` class takes user input to build the list, display it, and demonstrate traversal logic in Java.  
package LinkedList;

import java.util.*;

/**
 *
 * @author Samim
 */
class Traverse extends Node {

    protected Node start;

    public Traverse() {
        start = null;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void insert(int data) {
        Node newNode = new Node(data, null);

        // If the linked list is empty, make the new node as the head
        if (start == null) {
            start = newNode;
            return;
        }

        // Traverse to the end of the linked list
        Node current = start;
        while (current.link != null) {
            current = current.link;
        }

        // Insert the new node at the end
        current.link = newNode;
    }

    public void Traverse() {
        Node ptr = start;
        System.out.print(start.getData() + " " + "-->");
        ptr = start.getLink();
        while (ptr.getLink() != null) {
            System.out.print(ptr.getData() + " " + "-->");
            ptr = ptr.getLink();
        }

        System.out.print(ptr.getData() + "!!!!");
        System.out.println();
    }

    public void Display() {
        Node ptr = start;
        System.out.print(start.getData() + "--->");
        ptr = ptr.getLink();

        while (ptr.getLink() != null) {
            System.out.print(ptr.getData() + "--->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData() + " !!!!");
        System.out.println();
    }
}

class TraverseTest {

    protected static Traverse S;

    public static void main(String[] args) {
        int num;
        S = new Traverse();
        Scanner sc = new Scanner(System.in);

        System.out.println("...Starting Test For Traverse \n");
        for (int i = 0; i < 7; ++i) {
            System.out.println("Enter A Number :");
            try {
                num = sc.nextInt();
                S.insert(num);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("\n Created List is :");
        S.Display();
//        S.Traverse();    
        System.out.println("\n --- List Test Over ---");
    }
}
