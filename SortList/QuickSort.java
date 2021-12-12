package SortList;
public class QuickSort {

    public static void swap(int list[], int x, int y) {
        int temp = list[x];
        list[x] = list[y];
        list[y] = temp;
    }

    public static int partition(int list[], int left, int right) {

        int pivot = list[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (list[j] < pivot) {
                i++;
            }
        }
        swap(list, i + 1, right);

        return i + 1;
    }

    public static void sort(int list[], int left, int right) {

        if (left < right) {

            int pi = partition(list, left, right);

            sort(list, left, pi - 1);
            sort(list, pi + 1, right);

        }
    }

    public static void printArray(int list[]) {
        int size = list.length;

        System.out.printf("This list is Sorted by using QuickSort:\n\t");
        int i = 0;
        for (; i < size - 1; i++) {
            System.out.printf("%d -> ", list[i]);
        }
        System.out.printf("%d\n", list[i]);
    }
}
