public class AVLTree {

    Node root;

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node node, int data) {

        if (node == null)
            return new Node(data);

        if (data < node.data) {
            node.left = insertRecursive(node.left, data);
        }

        else if (data > node.data) {
            node.right = insertRecursive(node.right, data);
        }

        else {
            return node;
        }

        node.height = max(height(node.left), height(node.right)) + 1;
        int balance = getBalance(node);

        if (balance > 1 && data < node.left.data) {
            return rightRotate(node);
        } else if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        else if (balance < -1 && data > node.right.data) {
            return leftRotate(node);

        } else if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private Node rightRotate(Node node) {

        Node temp = node.left;
        Node t2 = temp.right;

        temp.right = node;
        node.left = t2;

        node.height = max(height(node.left), height(node.right)) + 1;
        temp.height = max(height(temp.left), height(temp.right)) + 1;

        return temp;

    }

    private Node leftRotate(Node node) {

        Node temp = node.right;
        Node t2 = temp.left;

        temp.left = node;
        node.right = t2;

        node.height = max(height(node.left), height(node.right)) + 1;
        temp.height = max(height(temp.left), height(temp.right)) + 1;

        return temp;

    }

    private int height(Node node) {
        if (node == null)
            return 0;
        return node.height;
    }

    private int max(int x, int y) {
        return (x > y) ? x : y;
    }

    private int getBalance(Node node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.left);
    }

    public void inOrder() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(Node node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.printf("%d->", node.data);
            inOrderRecursive(node.right);
        }
    }

}
