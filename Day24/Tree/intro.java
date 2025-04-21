//Binary Search Tree (BST)

package Day24.Tree;

import java.util.Scanner;

public class intro {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	Node root;

	public void add(int data) {
		root = addNode(root, data);
	}

	private Node addNode(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.data) {
			root.left = addNode(root.left, data);
		} else if (data > root.data) {
			root.right = addNode(root.right, data);
		}
		return root;

	}
	
	public void print() {
		System.out.println("Press 1 for Inorder.\nPress 2 for Post-order.\nPress 3 for Pre-order.");
		System.out.println("Enter your Choice:");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1: {
			inorder_traversal(root);
		}break;
		case 2: {
			postorder_traversal(root);
		}break;
		case 3: {
			preorder_traversal(root);
		}break;
		default:
			System.out.println("Not valid input");;
		}
		sc.close();
	}

	private void inorder_traversal(Node root) {
		if (root == null) {
			return;
		}
		inorder_traversal(root.left);
		System.out.print(root.data+ " ");
		inorder_traversal(root.right);
	}
	private void postorder_traversal(Node root) {
		if (root == null) {
			return;
		}
		inorder_traversal(root.left);
		inorder_traversal(root.right);
		System.out.print(root.data+ " ");
	}
	private void preorder_traversal(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data+ " ");
		inorder_traversal(root.left);
		inorder_traversal(root.right);
	}
}
