import java.util.*;
public class Robot_stair_claimbing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt(); 
        }

        long[] dp = new long[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < s; j++) {
                if (i - arr[j] >= 0) {
                    dp[i] += dp[i - arr[j]];
                }
            }
        }
        System.out.println(dp[n]);
    }
}
