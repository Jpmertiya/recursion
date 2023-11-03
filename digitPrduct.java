package recursion;

public class digitPrduct {

    public static void main(String[] args) {

        int n = 505;
        int ans = pro(n);
        System.out.println(ans);
    }

    static int pro(int n) {
        if (n % 10 == n)
            return n;
        return (n % 10) * pro(n / 10);
    }
}
