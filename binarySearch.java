package recursion;

public class binarySearch {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=6;
        int res=recur(arr,target,0,arr.length-1);
        System.out.println(res);
    }
    public static int recur(int[] arr,int target,int s,int e){

        if(s>e)
        return -1;
        int mid=s+(e-s)/2;
        if(target==arr[mid])
        return mid;
        if(arr[mid]>target)
        return recur(arr, target, s, mid-1);

        return recur(arr, target, mid+1, e);
    }
}
