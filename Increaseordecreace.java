import java.util.*;

public class Increaseordecreace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Set<Integer> distinct = new HashSet<>();
            for (int val : a) {
                distinct.add(val);
            }

            int distinctCount = distinct.size();
            System.out.println(2 * distinctCount - 1);
        }

        sc.close();
    }
}
