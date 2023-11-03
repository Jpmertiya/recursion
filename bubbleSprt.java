package recursion;

import java.util.Arrays;

public class bubbleSprt {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 3, 6, 8, 9 };
        bubble(arr,arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr, int r, int index) {
        if (r == 0)
            return;
        if (index < r) {
            if (arr[index] > arr[index + 1]) {
                //swap
                int temp=arr[index];
                arr[index]=arr[index+1];
                arr[index+1]=temp;
            }
            bubble(arr, r, index+1);
        }
        bubble(arr, r-1, 0);
    }
}
