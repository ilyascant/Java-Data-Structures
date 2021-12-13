public class BinarySearchTree {

    public Node root;

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    public Node insertRecursive(Node root, int data) {

        if (root == null) {
            root = new Node(data);
        }

        if (data > root.data)
            root.right = insertRecursive(root.right, data);
        else if (data < root.data)
            root.left = insertRecursive(root.left, data);

        return root;

    }

    public Node minValueNode(Node root) {
        Node temp = root;
        if (temp.left != null)
            temp = temp.left;

        return temp;
    }

    public void delete(int data) {
        deleteRecursive(root, data);
    }

    public Node deleteRecursive(Node root, int data) {

        if (root == null)
            return root;

        if (data > root.data)
            root.right = deleteRecursive(root.right, data);
        else if (data < root.data)
            root.left = deleteRecursive(root.left, data);
        else {
            if (root.left == null)
                return root = root.right;
            else if (root.right == null)
                return root = root.left;

            Node temp = minValueNode(root.right);
            root.data = temp.data;
            root.right = deleteRecursive(root.right, temp.data);
        }

        return root;

    }

    public void search(int data) {
        searchRecursive(root, data);
        if (root != null)
            System.out.printf("\n%d Degeri Bulundu\n", data);
        else
            System.out.printf("\n%d Degeri Bulunamadi\n", data);
    }

    public Node searchRecursive(Node root, int data) {

        if (root == null || root.data == data)
            return root;

        if (data < root.data)
            return searchRecursive(root.left, data);
        else
            return searchRecursive(root.right, data);

    }

    public void inOrder() {
        inOrderRecursive(root);
    }

    public void inOrderRecursive(Node root) {
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.printf("%d -> ", root.data);
            inOrderRecursive(root.right);
        }
    }

}
