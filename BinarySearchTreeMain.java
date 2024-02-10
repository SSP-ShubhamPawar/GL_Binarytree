package com.example.main;
import java.util.*;

public class BinarySearchTreeMain {
 
    // BST node
    static class Node {
        int key;
        Node left, right;
    };
 
    // Utility function to create a new node
    static Node newNode(int data)
    {
        Node temp = new Node();
 
        temp.key = data;
 
        temp.left = null;
        temp.right = null;
 
        return temp;
    }
 
    // A utility function to insert a new
    // Node with given key in BST
    static Node insert(Node root, int key)
    {
        // Create a new Node containing
        // the new element
        Node newnode = newNode(key);
 
        // Pointer to start traversing from root and
        // traverses downward path to search
        // where the new node to be inserted
        Node x = root;
 
        // Pointer y maintains the trailing
        // pointer of x
        Node y = null;
 
        while (x != null) {
            y = x;
            if (key < x.key)
                x = x.left;
            else
                x = x.right;
        }
 
        // If the root is null i.e the tree is empty
        // The new node is the root node
        if (y == null)
            y = newnode;
 
        // If the new key is less than the leaf node key
        // Assign the new node to be its left child
        else if (key < y.key)
            y.left = newnode;
 
        // else assign the new node its right child
        else
            y.right = newnode;
 
        // Returns the pointer where the
        // new node is inserted
        return y;
    }
 
    // A utility function to do inorder
    // traversal of BST
    static void Inorder(Node root)
    {
        if (root == null)
            return;
        else {
            Inorder(root.left);
            System.out.print(root.key + " ");
            Inorder(root.right);
        }
    }
 
    // Driver code
    public static void main(String args[])
    {
        /* Let us create following BST
                50
              /   \
            30      70
            / \   / \
           20 40 60 80 */
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of integer");
		
			int input = sc.nextInt();
			System.out.println("Enter numbers  = " );
			
        Node root = null;

    	for(int i = 0;i<input ;i++)
    	{
    		int in = sc.nextInt();
        root = insert(root, in);
        
    	}
        // Print inorder traversal of the BST
        Inorder(root);
    }
}
