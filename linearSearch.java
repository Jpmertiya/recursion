package recursion;

public class linearSearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 9 };
        System.out.println(isSorted(arr, 1));
    }

    public static int isSorted(int[] arr, int target) {
        return helper(arr, 0, target);
    }

    public static int helper(int[] arr, int index, int target) {
        if (index == arr.length - 1)
            return -1;
        if (target == arr[index])
            return index;
        return helper(arr, index+1, target);
    }
}
