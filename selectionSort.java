package recursion;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 6, 8, 9 };
        sort(arr, 0, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int max, int r, int c) {
        if (r == 0)
            return;
        if (r > c) {
            if (arr[c] > arr[max]) {
                sort(arr, c, r, c + 1);
            } else
                sort(arr, max, r, c + 1);
        } else {
            int temp = arr[r - 1];
            arr[r - 1] = arr[max];
            arr[max] = temp;
            sort(arr, 0, r - 1, 0);
        }
    }
}
