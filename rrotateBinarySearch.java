package recursion;

public class rrotateBinarySearch {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3,4};
        int taget=6;
        int ans=bs(arr, taget, 0, arr.length-1);
        System.out.println(ans);
    }

    public static int bs(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target)
            return m;
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return bs(arr, target, s, m - 1);
            } else {
                return bs(arr, target, m + 1, e);
            }
        }
        if (target >= arr[m] && target <= arr[e]) {
            return bs(arr, target, m + 1, e);
        } else
            return bs(arr, target, s, m - 1);
    }
}
