import search.binary.MySearch;
import search.binary.max.FindMax;
import sort.MySort;
import sum.MyCalc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={72,60,83,47,89,95};
        int max= FindMax.findMaximum(arr);//쵀댓값 찾기
        System.out.println("최댓값:"+ max);

        int[]CUME= MyCalc.calcCume(arr);
        for (int i = 0; i < CUME.length; i++) {
            System.out.printf("%3d", CUME[i]);
        }
        System.out.println();

        System.out.println("== 정렬 전 ==");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        System.out.println();

        int[] sorted = MySort.selctionSort(arr);
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        System.out.println();

        int pos = MySearch.binarySearch(sorted, 0,sorted.length - 1, 89);
        System.out.println("검출 위치는 " + pos);
    }
}