import java.util.*;
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class Traversal {

    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        if (isLeaf(node) == false) res.add(node.data);

        addLeftB(node, res);
        addLeaf(node, res);
        addRightB(node, res);

        return res;
    }

    void addLeftB(Node root, ArrayList<Integer> res) {
        Node curr = root.left;
        while (curr != null) {
            if (isLeaf(curr) == false) res.add(curr.data);
            if (curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    void addRightB(Node root, ArrayList<Integer> res) {
        Node curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while (curr != null) {
            if (isLeaf(curr) == false) temp.add(curr.data);
            if (curr.right != null) curr = curr.right;
            else curr = curr.left;
        }
        for (int i = temp.size() - 1; i >= 0; i--) {
            res.add(temp.get(i));
        }
    }

    void addLeaf(Node root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) addLeaf(root.left, res);
        if (root.right != null) addLeaf(root.right, res);
    }

    boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }
    public static void main(String[] args) {
        Traversal tree = new Traversal();
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);
        ArrayList<Integer> res = tree.boundaryTraversal(root);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
