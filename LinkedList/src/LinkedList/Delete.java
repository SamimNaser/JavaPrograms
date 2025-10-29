// Program: Delete a Node from a Singly Linked List  
// Topic: Linked List and Node Manipulation  
// Description: Implements insertion, deletion, and traversal operations in a singly linked list.  
// The `Delete` class extends `Node` and allows adding nodes in sorted order, deleting nodes by value,  
// and displaying the full list. The `DeleteTest` class handles user input and tests node deletion.  
// Demonstrates pointer manipulation, list traversal, and linked node re-linking logic in Java.  
package LinkedList;

import java.util.*;

/**
 *
 * @author Samim
 */
class Delete extends Node {

    protected Node start;

    public void Delete(int val) {
        Node nptr, ptr, save = null;//nptr=new pointer,ptr=pointer;
        nptr = new Node(val, null);

        boolean ins = false;
        if (start == null) {
            start = nptr;
        } else if (val <= start.getData()) {
            nptr.setLink(start);
            start = nptr;
        } else {
            save = start;
            ptr = start.getLink();

            while (ptr != null) {
                if (val >= save.getData() && val <= ptr.getData()) {
                    save.setLink(ptr);
                    nptr.setLink(ptr);
                    ins = true;
                    break;
                } else {
                    save = ptr;
                    ptr = ptr.getLink();
                }
            }
            if (ins == false) {
                save.setLink(nptr);
            }
        }
    }

    public boolean DeleteData(int val) {
        Boolean res = false;
        if (start.getData() == val) {
            start = start.getLink();
            res = true;
        } else {
            Node ptr, save;
            save = start;
            ptr = start.getLink();
            while (ptr != null) {
                if (ptr.getData() == val) {
                    Node next = ptr.getLink();
                    save.setLink(next);
                    res = true;
                    break;
                }
            }
        }
        return res;
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

class DeleteTest {

    protected static Delete S;

    public static void main(String[] args) {
        int num;
        S = new Delete();
        Scanner sc = new Scanner(System.in);

        System.out.println("...Starting Test For Deletion \n");
        for (int i = 0; i < 5; ++i) {
            System.out.println("Enter A Number :");
            try {
                num = sc.nextInt();
                S.DeleteData(num);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("Enter Number To be Deleted :");
        try {
            num = sc.nextInt();
            Boolean res = S.DeleteData(num);
            if (res == true) {
                System.out.println(num + " deleted sucessfully !");
            } else {
                System.out.println("Sorry ! Element Not Found in List ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\n Created List is :");
        S.Display();
        System.out.println("\n --- List Test Over ---");
    }
}
