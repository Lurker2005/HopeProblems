import java.util.*;
public class Islandcounts {
    public static void bfs(int[][] grid,boolean[][]visited,int row,int col){
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]>queue=new LinkedList<>();
        int[][] direction={{0,1},{0,-1},{1,0},{-1,0}};
        queue.add(new int[]{row,col});
        while(!queue.isEmpty()){
            int[] cord=queue.poll();
            int curx=cord[0];
            int cury=cord[1];
            visited[curx][cury]=true;
            for(int i=0;i<4;i++){
                int newx=curx+direction[i][0];
                int newy=cury+direction[i][1];
                if(newx>=0&&newx<n&&newy>=0&&newy<m)
                    if(grid[newx][newy]==1&&!visited[newx][newy]){
                        queue.add(new int[]{newx,newy});
                    }
            }
            }
        }
        
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int grid[][]=new int[n][m];
		boolean visited[][]=new boolean[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        grid[i][j]=sc.nextInt();
		    }
		}
		int count=0;
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        if(grid[i][j]==1&&!visited[i][j]){
                    bfs(grid,visited,i,j);
		            count++;
		        }
		    }
		}
		System.out.println(count);

	}
}