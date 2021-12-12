package linkedList;
public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insertEnd(5); // inserts to end
        linkedList.insertEnd(6); // inserts to end
        linkedList.insertEnd(3); // inserts to end

        linkedList.insertStart(2); // inserts to start
        linkedList.insertStart(9); // inserts to start
        linkedList.insertStart(4); // inserts to start

        linkedList.insertAt(2, 11); // inserts 11 to index 2

        linkedList.deleteStart(); // Deletes from start 
        linkedList.deleteEnd(); // Deletes from end
        linkedList.deleteAt(2); // Deletes value of index = 2

        linkedList.printArray(); // Prints all 
    }
}