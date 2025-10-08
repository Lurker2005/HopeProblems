import java.util.*;
import java.io.*;

public class Static_Range_Sum_Queries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int q = Integer.parseInt(input[1]);
        
        long[] prefixsum = new long[n + 1]; 
        prefixsum[0] = 0; 
        
        input = br.readLine().split(" ");
        for(int i = 1; i <= n; i++){
            prefixsum[i] = prefixsum[i-1] + Integer.parseInt(input[i-1]);
        }
        
        for(int i = 0; i < q; i++){
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            pw.println(prefixsum[b] - prefixsum[a-1]);
        }
        
        pw.close();
        br.close();
    }    
}