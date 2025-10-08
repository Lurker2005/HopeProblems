import java.util.*;
public class labyrinth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        char[][]str=new char[n][m];
        boolean[][] visited=new boolean[n][m];
        for(int row=0;row<n;row++){
            String str1=sc.nextLine();
            for(int col=0;col<m;col++){
                str[row][col]=str1.charAt(col);

            }
        }
        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(str[i][j]=='A'){
                    queue.add(new int[]{i,j});
                    break;
                }
            }
        }
        int count=0;
        Set<Character>path=new HashSet<>();
        while(!queue.isEmpty()){
            int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
            int[] ind=queue.poll();
            visited[ind[0]][ind[1]]=true;
            count++;
            for(int[] i:directions){
                int currow=ind[0]+i[0];
                int curcol=ind[1]+i[1];
                if(currow>0&&curcol>0&&currow<n&&curcol<m&&!visited[currow][curcol]){
                    
                }
            }
        }
            
        
    }


    
}
