package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * important for concept perspective
 * 
 * we have to find list of element that are command in array using recursion
 */
public class listOfComman {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 6, 7, 8 };
        int target = 4;
        ArrayList<Integer> res = recur(arr, target, 0);
        System.out.println("index number "+res.toString());
    }

    public static ArrayList<Integer> recur(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length)
            return list;
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> answer = recur(arr, target, index + 1);
        list.addAll(answer);
        return list;
    }

}
