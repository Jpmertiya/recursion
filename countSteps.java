package recursion;

public class countSteps {
    /**
     * write a program to count number of steps to make any number 0
     * 
     */
    public static void main(String[] args) {
        int n = 14;
        System.out.println(num(n));
    }

    public static int num(int n) {
        int ans = helper(n, 0);
        return ans;
    }

    public static int helper(int n, int step) {
        if (n == 0)
            return step;
        if (n % 2 == 0)
            return helper(n / 2, step + 1);
        return helper(n - 1, step+1);
    }

}
