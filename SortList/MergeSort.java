package SortList;
public class MergeSort {

    public static void merge(int list[], int left, int middle, int right) {

        int n1 = middle - left + 1;
        int n2 = right - middle;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = list[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = list[middle + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                list[k] = L[i];
                i++;
            } else {
                list[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            list[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            list[k] = R[j];
            j++;
            k++;
        }

    }

    public static void sort(int list[], int left, int right) {

        if (left < right) {
            int middle = (left + right) / 2;

            sort(list, left, middle);
            sort(list, middle + 1, right);

            merge(list, left, middle, right);

        }

    }

    public static void printArray(int list[]) {
        int size = list.length;

        System.out.printf("This list is Sorted by using MergeSort:\n\t");
        int i = 0;
        for (; i < size - 1; i++) {
            System.out.printf("%d -> ", list[i]);
        }
        System.out.printf("%d\n", list[i]);
    }
}
