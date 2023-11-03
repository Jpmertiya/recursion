package recursion;

public class checkForSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7,  9 };
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {
        return helper(arr, 0);
    }

    public static boolean helper(int[] arr, int index) {
        if (index == arr.length - 1)
            return true;
        return (arr[index]<arr[index+1] && helper(arr, index+1));
    }
}
