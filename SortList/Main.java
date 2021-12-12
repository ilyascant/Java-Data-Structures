package SortList;
public class Main {

    public static void main(String[] args) {

        int newList[] = { 6, 5, 11, 23, 12, 45, 50, 54, 46 };
        int size = newList.length;

        BubbleSort.sort(newList);
        BubbleSort.printArray(newList);

        SelectionSort.sort(newList);
        SelectionSort.printArray(newList);

        InsertionSort.sort(newList);
        InsertionSort.printArray(newList);

        MergeSort.sort(newList, 0, size - 1);
        MergeSort.printArray(newList);

        QuickSort.sort(newList, 0, size - 1);
        QuickSort.printArray(newList);

    }

}
