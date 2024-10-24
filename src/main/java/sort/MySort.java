package sort;

import java.util.Arrays;

public class MySort {
    public static void main(String[] args) {
        int[] arr = {72, 60, 83,47, 89, 95};
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        System.out.println();

        int[] sortArr = selctionSort(arr);
        Arrays.stream(sortArr).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public static int[] selctionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int insertElement = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > insertElement) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = insertElement;
        }
//        return arr;
    }
}
