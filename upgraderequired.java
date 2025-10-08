import java.util.*;
public class upgraderequired {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Q = sc.nextInt();
        
        long[] count = new long[N + 1];
        
        for(int i = 1; i <= N; i++) {
            count[i] = 1;
        }
        
        int minVersion = 1;
        
        for(int q = 0; q < Q; q++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            if(X < minVersion) {
                System.out.println(0);
                continue;
            }
            
            long upgraded = 0;
            for(int ver = minVersion; ver <= X; ver++) {
                upgraded += count[ver];
                count[ver] = 0;
            }
            
            count[Y] += upgraded;
            minVersion = X + 1;
            
            System.out.println(upgraded);
        }
        
        sc.close();
    }
}