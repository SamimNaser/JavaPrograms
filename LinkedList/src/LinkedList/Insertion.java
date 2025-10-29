// Program: Insert Nodes into a Singly Linked List (Dynamic Insertion Test)  
// Topic: Linked List and Node Manipulation  
// Description: Demonstrates insertion and traversal in a singly linked list.  
// The `Insertion` class extends `Node` and supports inserting new nodes in sorted order based on data values.  
// The `InsertionTest` class handles user input to test insertion and list display operations.  
// Demonstrates node creation, link management, and traversal logic in a dynamically constructed list.  
package LinkedList;

import java.util.*;

/**
 *
 * @author Samim
 */
public class Insertion extends Node {

    protected Node head;
    int n;

    public Insertion() {
        head = null;
    }

    void Insert(int data) {
        Node current = head;

        if (head == null) {
            head = new Node();
        } else if (head.data >= data) {
            head = new Node();
            System.out.println("else if");

        } else {
            System.out.println("else");
            Node p = head.link;
            Node q = head;
            while (p != null) {
                if (p.data >= n) {
                    Node n1 = new Node();
                    q.link = n1;
                    n1.link = p;
                    break;
                }
                q = p;
                p = p.link;
            }
            q.link = new Node();
        }
    }

    public void Display() {
        Node ptr = head;
        System.out.print(head.getData() + "--->");
        ptr = ptr.getLink();

        while (ptr.getLink() != null) {
            System.out.print(ptr.getData() + "--->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData() + " !!!!");
        System.out.println();
    }
}

class InsertionTest {

    protected static Insertion S;

    public static void main(String[] args) {

        Insertion obj = new Insertion();
        int num;
        S = new Insertion();
        Scanner sc = new Scanner(System.in);

        System.out.println("...Starting Test For Insertion \n");
        for (int i = 0; i < 2; ++i) {
            System.out.println("Enter A Number :");
            try {
                num = sc.nextInt();
                S.Insert(num);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("\n Created List is :");
        S.Display();
        System.out.println("\n --- List Test Over ---");
    }
}
