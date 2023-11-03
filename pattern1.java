package recursion;

public class pattern1 {
    public static void main(String[] args) {
        int r = 5, c = 0;
        pattern2(r, c);
    }

    public static void pattern(int r, int c) {
        if (r == 0)
            return;
        if (r == c) {
            System.out.println();
            pattern(r - 1, 0);
            return;
        } else {
            System.out.print("* ");
            pattern(r, c + 1);
        }
    }

    public static void pattern2(int r, int c) {
        if (r == 0)
            return;
        if (c < r) {
            pattern2(r, c + 1);
            System.out.print("* ");
        } else {
            pattern2(r - 1, 0);
            System.out.println();

        }
    }
}
