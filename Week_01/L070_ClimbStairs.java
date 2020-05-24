package Array;

public class L070_ClimbStairs {
    public static void main(String[] args) {
        int n = 3;
        int ret = new L070_ClimbStairs().climbStairs(n);
        System.out.print(ret);

    }

    // 2. 仅保存最后2个数字即可
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int f1 = 1, f2 = 2, tmp = 0;
        for (int i = 3; i <= n; i++) {
            tmp = f1 + f2;
            f1 = f2;
            f2 = tmp;
        }
        return f2;
    }

    // 1. 数组
    public int climbStairs1(int n) {
        if (n <= 2) return n;
        int[] ret = new int[n];
        ret[0] = 1;
        ret[1] = 2;
        for (int i = 2; i <= n - 1; i++) {
            ret[i] = ret[i - 2] + ret[i - 1];
        }
        return ret[n - 1];
    }
}
