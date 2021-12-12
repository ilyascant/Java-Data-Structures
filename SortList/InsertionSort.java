package SortList;
public class InsertionSort {

    public static void sort(int list[]) {
        int size = list.length;

        for (int i = 1; i < size; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }

    }

    public static void printArray(int list[]) {
        int size = list.length;

        System.out.printf("This list is Sorted by using InsertionSort:\n\t");
        int i = 0;
        for (; i < size - 1; i++) {
            System.out.printf("%d -> ", list[i]);
        }
        System.out.printf("%d\n", list[i]);
    }

}
