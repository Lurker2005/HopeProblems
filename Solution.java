import java.util.*;
import java.io.*;

public class Solution {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        
        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
    }
    
    static long manhattanDist(long r1, long c1, long r2, long c2) {
        return Math.abs(r1 - r2) + Math.abs(c1 - c2);
    }
    
    static long chebyshevDist(long r1, long c1, long r2, long c2) {
        return Math.max(Math.abs(r1 - r2), Math.abs(c1 - c2));
    }
    
    static long solve(long n, long rK, long cK, long rD, long cD) {
        // Check if Krug is already at a corner
        boolean atCorner = (rK == 0 || rK == n) && (cK == 0 || cK == n);
        
        if (atCorner) {
            long dist = chebyshevDist(rK, cK, rD, cD);
            if (dist > 1) {
                return -1;
            }
            return dist;
        }
        
        // Check all 4 corners for escape
        long[][] corners = {{0, 0}, {0, n}, {n, 0}, {n, n}};
        
        for (long[] corner : corners) {
            long cr = corner[0];
            long cc = corner[1];
            
            long krugDist = manhattanDist(rK, cK, cr, cc);
            long doranDist = chebyshevDist(rD, cD, cr, cc);
            
            if (krugDist < doranDist) {
                return -1;
            }
        }
        
        // Krug cannot escape to any corner
        long minDistToEdge = Math.min(Math.min(rK, n - rK), Math.min(cK, n - cK));
        long initialDist = chebyshevDist(rK, cK, rD, cD);
        
        // The survival time is capped by the grid size
        return Math.min(initialDist + 2 * minDistToEdge, n);
    }
    
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int t = (int) sc.nextLong();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long rK = sc.nextLong();
            long cK = sc.nextLong();
            long rD = sc.nextLong();
            long cD = sc.nextLong();
            
            long result = solve(n, rK, cK, rD, cD);
            out.println(result);
        }
        
        out.close();
    }
}