package recursion;

public class countZeros {

    public static void main(String[] args) {
        int n = 0;
        System.out.println(count(n));
    }

    public static int count(int n) {
        int ans = sear(n, 0);
        return ans;
    }

    public static int sear(int n, int count) {
        if (n == 0)
            return count;
        if(n%10==0){
            sear(n/10, count++);
        }
        return sear(n/10, count);
    }

}
