// Program: Binary Search Tree Implementation  
// Topic: Binary Tree and Recursion  
// Description: Implements a Binary Search Tree (BST) with basic operations — insertion and search.  
// The `Tree` class defines a node structure with integer data and left/right child references.  
// The `BinaryTree` class manages tree creation, recursive insertion (`insertRec`), and recursive searching (`searchRec`).  
// Demonstrates recursive tree traversal, conditional branching, and binary search logic.  
package binarytree;

/**
 *
 * @author Samim
 */
public class Tree {

    Tree left, right;
    int data;

    Tree(int value) {
        data = value;
        left = right = null;
    }
}

class BinaryTree {

    Tree root;

    BinaryTree() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    Tree insertRec(Tree root, int data) {
        if (root == null) {
            root = new Tree(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    boolean search(int data) {
        return searchRec(root, data);
    }

    boolean searchRec(Tree root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (root.data < data) {
            return searchRec(root.right, data);
        }
        return searchRec(root.left, data);
    }

    public static void main(String[] args) {
        BinaryTree obj = new BinaryTree();

        obj.insert(50);
        obj.insert(30);
        obj.insert(20);
        obj.insert(40);
        obj.insert(70);
        obj.insert(60);
        obj.insert(80);

        if (obj.search(90)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
