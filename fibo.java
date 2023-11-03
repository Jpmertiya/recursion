package recursion;

public class fibo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fiboByFormula(i) + ", ");
        }
    }

    static int fiboByFormula(int n) {
        return (int)  ((Math.pow(((1+Math.sqrt(5))/2), n)-Math.pow(((1- Math.sqrt(5))/2), n))/Math.sqrt(5));
    }

    public static int fib(int n) {
        // recursive relation fibo(n)=fibo(n-1)+fibo(n-2)

        // base condition
        if (n < 2)
            return n;
        // recursice calls
        return fib(n - 1) + fib(n - 2);

    }
}