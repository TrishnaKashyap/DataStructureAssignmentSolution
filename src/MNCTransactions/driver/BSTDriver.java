package MNCTransactions.driver;

import MNCTransactions.SkewBST.SkewedBST;
import MNCTransactions.node.Node;

public class BSTDriver {

    static Node root;

//     print BST
    public void printTree(Node root) {
        if (root == null) return;;
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }

//     entry point
    public static void main(String[] args) {
        BSTDriver bst = new BSTDriver();
        SkewedBST skewBst = new SkewedBST();
        bst.root = new Node(50);
        bst.root.left = new Node(30);
        bst.root.right = new Node(60);
        bst.root.left.left = new Node(10);
        bst.root.left.right = new Node(45);
        bst.root.right.left = new Node(55);
        bst.root.right.right = new Node(65);
        System.out.println("Initial tree (Inorder): ");
        bst.printTree(root);
        int k = 0;

//        value of k decides if the order of tree will be ascending (k=0) or descending (k=1).
        Node newRoot = skewBst.skewedBST(root, k);
        System.out.println("Skewed tree: ");
        bst.printTree(newRoot);
    }

}