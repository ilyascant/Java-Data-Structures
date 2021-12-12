package linkedList;

public class LinkedList {

    public Node head;

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////          INSERT        /////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    public void insertStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            node.next = n;
            head = node;
        }
    }

    public void insertEnd(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            int nIndex = 1;
            for (; nIndex < index; nIndex++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;

        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////          DELETE        /////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    public void deleteStart() {
        head = head.next;

        // garbage collector handles deletion
    }

    public void deleteEnd() {
        Node n = head;

        while (n.next.next != null) {
            n = n.next;
        }
        n.next = null;

    }

    public void deleteAt(int index) {
        Node n = head;
        Node temp = n;

        for (int i = 0; i < index - 1; i++) {
            n = n.next;
            temp = temp.next;
        }
        temp = temp.next;

        n.next = temp.next;
    }

    public void printArray() {
        Node n = head;
        while (n.next != null) {
            System.out.printf("%d -> ", n.data);
            n = n.next;
        }
        System.out.printf("%d ", n.data);

    }

}
