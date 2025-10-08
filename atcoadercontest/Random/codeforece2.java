import java.util.*;
import java.io.*;
public class codeforece2 {
    public static void main(String[] args) throws IOException {
        // Reader setup for fast input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());  // Number of test cases

        while (t-- > 0) {
            String[] nk = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            String s = br.readLine();

            // Attempt to construct permutation
            int[] result = constructPermutation(n, k, s);

            if (result == null) {
                out.println("NO");
            } else {
                out.println("YES");
                for (int i = 0; i < n; i++) {
                    out.print(result[i] + (i == n - 1 ? "\n" : " "));
                }
            }
        }

        out.flush();
        out.close();
    }

    // This method should implement the logic to build the permutation p
    // or return null if impossible
    private static int[] constructPermutation(int n, int k, String s) {
        // Placeholder: naive construction for test cases with all zeros in s
        // since no restrictions apply there
        boolean allZero = true;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                allZero = false;
                break;
            }
        }
        if (allZero) {
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = i + 1;
            }
            return p;
        }

        return null;
    }
    
}
