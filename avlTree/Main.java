public class Main {
    public static void main(String[] args) {

        AVLTree node = new AVLTree();

        node.insert(25);
        node.insert(5);
        node.insert(35);
        node.insert(13);
        node.insert(15);
        node.insert(12);
        node.insert(19);
        node.insert(21);
        node.insert(3);
        node.inOrder();
    }
}
