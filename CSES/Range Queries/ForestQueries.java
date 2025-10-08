// import java.util.*;
// public class ForestQueries{
//     public static void query(int[][]preixsum,int x1,int y1,int x2,int y2){
//         int sum = preixsum[x2][y2];
//         if (x1 > 0) sum -= preixsum[x1-1][y2];
//         if (y1 > 0) sum -= preixsum[x2][y1-1];
//         if (x1 > 0 && y1 > 0) sum += preixsum[x1-1][y1-1];
//         System.out.println(sum);

//     }
//     public static void main (String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int q=sc.nextInt();
//         sc.nextLine();
//         int[][] prefixsum=new int[n][n];
//         for(int i=0;i<n;i++){
//             String str=sc.nextLine();
//             for(int j=0;j<n;j++){
//                 int val = (str.charAt(j) == '*') ? 1 : 0;
//                 prefixsum[i][j] = val 
//                     + (i > 0 ? prefixsum[i-1][j] : 0)
//                     + (j > 0 ? prefixsum[i][j-1] : 0)
//                     - (i > 0 && j > 0 ? prefixsum[i-1][j-1] : 0);



//             }
//         }

//         while(q-->0){
//             int x1 = sc.nextInt() - 1;
//             int y1 = sc.nextInt() - 1;
//             int x2 = sc.nextInt() - 1;
//             int y2 = sc.nextInt() - 1;
//             query(prefixsum, x1, y1, x2, y2);

//         }
//     }
// }
import java.io.*;
import java.util.*;

public class ForestQueries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[][] prefixsum = new int[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                int val = (line.charAt(j) == '*') ? 1 : 0;
                prefixsum[i][j] = val 
                    + (i > 0 ? prefixsum[i-1][j] : 0)
                    + (j > 0 ? prefixsum[i][j-1] : 0)
                    - (i > 0 && j > 0 ? prefixsum[i-1][j-1] : 0);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < q; k++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) - 1;
            int y1 = Integer.parseInt(st.nextToken()) - 1;
            int x2 = Integer.parseInt(st.nextToken()) - 1;
            int y2 = Integer.parseInt(st.nextToken()) - 1;

            int sum = prefixsum[x2][y2];
            if (x1 > 0) sum -= prefixsum[x1-1][y2];
            if (y1 > 0) sum -= prefixsum[x2][y1-1];
            if (x1 > 0 && y1 > 0) sum += prefixsum[x1-1][y1-1];

            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
