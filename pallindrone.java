package recursion;

public class pallindrone {
    public static void main(String[] args) {
        int m=151;
        System.out.println(reverse1(m));
    }
    static boolean reverse1(int n) {
        int digit=(int)Math.log10(n)+1;
        return helper(n,digit)==n;
     }
     public static int helper(int n,int digit){
         if(n%10==n)
         return n;
         int rem=n%10;
         return rem*(int)Math.pow(10, digit-1)+helper(n/10, digit-1);
     }
}
