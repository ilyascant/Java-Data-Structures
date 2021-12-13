public class Main {

    public static void main(String[] args) {

        BinarySearchTree bts = new BinarySearchTree();

        bts.insert(5);
        bts.insert(9);
        bts.insert(4);
        bts.insert(2);
        bts.insert(7);
        bts.insert(11);

        bts.delete(4);

        bts.search(5);

        bts.inOrder();

    }

}
