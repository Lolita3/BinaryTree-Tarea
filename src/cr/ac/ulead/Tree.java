package cr.ac.ulead;

import cr.ac.ulead.principal.Persona;

import java.util.Stack;

public class Tree {

	private Node root; // first node of tree


	public Tree() {
		root = null;
	}


	public void insert(Persona newPersona) {
		Node newNode = new Node();
		newNode.persona = newPersona;
		if (root == null)
			root = newNode;
		else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				if (newPersona.getFechaNac().isAfter(current.persona.getFechaNac())) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						return;
					}
				}
				if (newPersona.getFechaNac().isBefore(current.persona.getFechaNac())) {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						return;
					}
					if (newPersona.getFechaNac().isEqual(current.persona.getFechaNac())) {
						int cedula = Integer.parseInt(newNode.persona.getCedula());
						int cedulanueva = Integer.parseInt(current.persona.getCedula());
						if (cedula < cedulanueva) {
							current = current.leftChild;
							if (current == null) {
								parent.leftChild = newNode;
								return;
							}
						} else {
							current = current.rightChild;
							if (current == null) {
								parent.rightChild = newNode;
								return;
							}
						}
					}
				}
			}
		}
	}



	public void traverse(int traverseType){
		switch (traverseType) {
			case 1:
				System.out.print("\nPreorder traversal: ");
				preOrder(root);
				break;
			case 2:
				System.out.print("\nInorder traversal:  ");
				inOrder(root);
				break;
			case 3:
				System.out.print("\nPostorder traversal: ");
				postOrder(root);
				break;
		}
		System.out.println();
	}


	private void preOrder(Node localRoot){
		if (localRoot != null) {
			System.out.print(localRoot.persona + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}


	private void inOrder(Node localRoot){
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.persona + " ");
			inOrder(localRoot.rightChild);
		}
	}


	private void postOrder(Node localRoot){
		if (localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			System.out.print(localRoot.persona + " ");
		}
	}


	public void displayTree() {
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("......................................................");
		while (isRowEmpty == false) {
			Stack localStack = new Stack();
			isRowEmpty = true;

			for (int j = 0; j < nBlanks; j++)
				System.out.print(' ');

			while (globalStack.isEmpty() == false) {
				Node temp = (Node) globalStack.pop();
				if (temp != null) {
					System.out.print(temp.persona);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);

					if (temp.leftChild != null || temp.rightChild != null)
						isRowEmpty = false;
				} else {
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for (int j = 0; j < nBlanks * 2 - 2; j++)
					System.out.print(' ');
			}
			System.out.println();
			nBlanks /= 2;
			while (localStack.isEmpty() == false)
				globalStack.push(localStack.pop());
		}
		System.out.println("......................................................");
	}
}