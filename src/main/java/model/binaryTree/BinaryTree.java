package model.binaryTree;

import java.util.ArrayList;

public class BinaryTree {
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	private Node root;

	public BinaryTree(int value) {
		root = new Node(value);
	}

	public Node insert(Node node, int value) {
		if (node == null) {
			node = new Node(value);
			return node;
		}
		if (value < node.getValue()) {
			node.setLeft(insert(node.getLeft(), value));
		} else if (value > node.getValue()) {
			node.setRight(insert(node.getRight(), value));
		}else {
			node.setCount(node.getCount()+1);
		}
		return node;
	}

	public ArrayList<Integer> inOrder(Node node) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		if (node != null) {
			arrayList.addAll(inOrder(node.getLeft()));
			arrayList.add(node.getValue());
			arrayList.addAll(inOrder(node.getRight()));
		}
		return arrayList;

	}

	static class Node {
		private int value;

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		private int count;
		private Node left;
		private Node right;

		Node(int value) {
			this.setValue(value);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}
	}
}
