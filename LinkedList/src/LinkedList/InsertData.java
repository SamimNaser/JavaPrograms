// Program: Insert Nodes into a Singly Linked List  
// Topic: Linked List and Node Insertion  
// Description: Implements insertion and traversal operations in a singly linked list.  
// The `InsertData` class extends `Node` and allows adding new nodes at the end of the list using the `insert()` method.  
// The `Display()` method prints all nodes in sequence, while `InsertDataTest` class tests insertion through user input.  
// Demonstrates pointer manipulation, dynamic node creation, and linked list traversal in Java.  
package LinkedList;

import java.util.*;

/**
 *
 * @author Samim
 *
 */

class InsertData extends Node {

    protected Node start;

    public InsertData() {
        start = null;
    }

    public boolean isEmpty() {
        return start == null;
    }
//    public void Insert(int val){
//        Node nptr,ptr,save=null;//nptr=new pointer,ptr=pointer;
//        nptr=new Node(val, null);
//        
//        boolean ins=false;
//        if(start==null){
//            start=nptr;
//        }
//        else if(val<=start.getData()){
//            nptr.setLink(start);
//            start=nptr;
//        }
//        else{
//            save=start;
//            ptr=start.getLink();
//            
//            while(ptr!=null){
//                if(val>=save.getData() && val<=ptr.getData()){
//                    save.setLink(ptr);
//                    nptr.setLink(ptr);
//                    ins=true;
//                    break;
//                }
//                
//                else{
//                    save=ptr;
//                    ptr=ptr.getLink();
//                }
//            }
//            if(ins==false){
//                save.setLink(nptr);
//            }
//        }
//    }

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

class InsertDataTest {

    protected static InsertData S;

    public static void main(String[] args) {
        int num;
        S = new InsertData();
        Scanner sc = new Scanner(System.in);

        System.out.println("...Starting Test For Insertion \n");
        for (int i = 0; i < 5; ++i) {
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
        System.out.println("\n --- List Test Over ---");
    }
}
