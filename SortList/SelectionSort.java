package SortList;
public class SelectionSort {

    public static void swap(int list[], int x, int y) {
        int temp = list[x];
        list[x] = list[y];
        list[y] = temp;
    }

    public static void sort(int list[]) {

        int size = list.length;

        for (int i = 0; i < size - 1; i++) {
            int indexOfMin = i;
            for (int j = 1 + i; j < size; j++) {
                if (list[j] < list[indexOfMin])
                    indexOfMin = j;

            }
            swap(list, i, indexOfMin);
        }
    }

    public static void printArray(int list[]) {
        int size = list.length;

        System.out.printf("This list is Sorted by using SelectionSort:\n\t");
        int i = 0;
        for (; i < size - 1; i++) {
            System.out.printf("%d -> ", list[i]);
        }
        System.out.printf("%d\n", list[i]);
    }
}
