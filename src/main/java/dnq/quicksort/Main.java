package dnq.quicksort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();

        int[] arr = {15, 22, 13, 27, 12,10, 20, 25};
        Arrays.stream(arr).sorted().forEach(System.out::println);

        qs.quickSort(arr, 0, arr.length - 1);

        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
