package SortList;
public class BubbleSort {
    public static void swap(int list[], int x, int y) {
        int temp = list[x];
        list[x] = list[y];
        list[y] = temp;
    }

    public static void sort(int list[]) {

        int size = list.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (list[j] > list[j + 1])
                    swap(list, j, j + 1);
            }
        }

    };

    public static void printArray(int list[]) {
        int size = list.length;

        System.out.printf("This list is Sorted by using BubbleSort:\n\t");
        int i = 0;
        for (; i < size - 1; i++) {
            System.out.printf("%d -> ", list[i]);
        }
        System.out.printf("%d\n", list[i]);
    }
}
