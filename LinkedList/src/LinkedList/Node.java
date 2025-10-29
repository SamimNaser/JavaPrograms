// Program: Node Class for Linked List  
// Topic: Linked List Implementation  
// Description: Defines the `Node` class, which serves as the building block of linked lists.  
// Each node contains an integer `data` field and a reference `link` to the next node.  
// Provides constructors for initialization, setter and getter methods for data and link manipulation,  
// and acts as the core structure used by other linked list operations such as insertion, deletion, and traversal.  
package LinkedList;

/**
 *
 * @author Samim
 */
public class Node {

    int data;
    Node link;

    public Node() {
        link = null;
        data = 0;
    }

    public Node(int d, Node n) {
        link = n;
        data = d;
    }

    public void setLink(Node n) {
        link = n;
    }

    public void setData(int d) {
        data = d;
    }

    public Node getLink() {
        return link;
    }

    public int getData() {
        return data;
    }
}
