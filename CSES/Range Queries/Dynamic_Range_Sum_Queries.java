import java.util.*;

public class Dynamic_Range_Sum_Queries {
    // Update function for segment tree
    static void update(long[] tree, int idx, int left, int right,
                       int ql, int qr, int val) {
        if (left > qr || right < ql) {
            return;
        }
        if (left >= ql && right <= qr) {
            tree[idx] = val;
            return;
        }
        int mid = (left + right) / 2;
        update(tree, idx * 2, left, mid, ql, qr, val);
        update(tree, idx * 2 + 1, mid + 1, right, ql, qr, val);
        tree[idx] = tree[idx * 2] + tree[idx * 2 + 1];
    }

    // Sum query function for segment tree
    static long findSum(long[] tree, int idx, int left, int right,
                        int ql, int qr) {
        if (ql > right || qr < left) {
            return 0;
        }
        if (left >= ql && right <= qr) {
            return tree[idx];
        }
        int mid = (left + right) / 2;
        return findSum(tree, idx * 2, left, mid, ql, qr)
                + findSum(tree, idx * 2 + 1, mid + 1, right, ql, qr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        int lg = 0;
        while ((1 << lg) < n) {
            lg++;
        }
        int len = 1 << lg;
        long[] tree = new long[len * 2];
        for (int i = len; i < len + n; i++) {
            tree[i] = sc.nextLong();
        }
        for (int i = len - 1; i > 0; i--) {
            tree[i] = tree[i * 2] + tree[i * 2 + 1];
        }

        while (q-- > 0) {
            int qt = sc.nextInt();
            if (qt == 1) {
                int k = sc.nextInt() - 1, u = sc.nextInt();
                update(tree, 1, len, len * 2 - 1, len + k, len + k, u);
            } else {
                int ql = sc.nextInt() - 1, qr = sc.nextInt() - 1;
                long ans = findSum(tree, 1, len, len * 2 - 1, ql + len, qr + len);
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
