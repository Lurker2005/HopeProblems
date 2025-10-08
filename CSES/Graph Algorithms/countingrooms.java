//DFS approach not working for some testcase
// import java.util.*;
// public class countingrooms {
//     public static boolean dfs(char[][] arr,boolean[][] visited,int row,int col,int n,int m){
//         if(row<0 || col<0 || row>=n || col>=m || arr[row][col]=='#' || visited[row][col]){
//             return false;
//         }

//         visited[row][col]=true;
//         dfs(arr,visited,row+1,col,n,m);
//         dfs(arr,visited,row-1,col,n,m);
//         dfs(arr,visited,row,col+1,n,m);
//         dfs(arr,visited,row,col-1,n,m);
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         sc.nextLine();
//         char[][] arr = new char[n][m];
//         for(int row = 0; row < n; row++) {
//             String str = sc.nextLine();
//             for(int col = 0; col < m; col++) {
//                 arr[row][col] = str.charAt(col);
//             }
//         }
//         boolean[][] visited = new boolean[n][m];
//         int count = 0;
//         for(int row = 0; row < n; row++) {
//             for(int col = 0; col < m; col++) {
//                 if(arr[row][col] == '.' && !visited[row][col]) {
//                     if(dfs(arr, visited, row, col, n, m)) {
//                         count++;
//                     }
//                 }
//             }
//         }
//         System.out.println(count);
//     }

// }
////BFS approach
import java.util.*;
public class countingrooms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        char[][] arr=new char[n][m];
        for(int row=0;row<n;row++){
            String str=sc.nextLine();
            for(int col=0;col<m;col++){
                arr[row][col]=str.charAt(col);
            }
        }
        boolean[][] visited=new boolean[n][m];
        Queue<int[]> q=new LinkedList<>();
        int count=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(arr[row][col]=='.'&&!visited[row][col]){
                    count++;
                    q.add(new int[]{row,col});
                    visited[row][col]=true;
                    while(!q.isEmpty()){
                        int[] curr=q.poll();
                        int r=curr[0];
                        int c=curr[1];
                        int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
                        for(int[] dir:directions){
                            int newRow=r+dir[0];
                            int newCol=c+dir[1];
                            if(newRow>=0 && newCol>=0 && newRow<n && newCol<m && arr[newRow][newCol]=='.' && !visited[newRow][newCol]){
                                q.add(new int[]{newRow,newCol});
                                visited[newRow][newCol]=true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}