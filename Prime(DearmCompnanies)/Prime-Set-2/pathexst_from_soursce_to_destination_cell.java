import java.util.*;
public class pathexst_from_soursce_to_destination_cell {
    public static boolean dfs(int[][] grid,boolean[][] visited,int si,int sj,int di,int dj){
        if(si<0||sj<0||si>=grid.length||sj>=grid[0].length||visited[si][sj]||grid[si][sj]==0){
            return false;
        }
        if(si==di&&sj==dj){
            return true;
        }
        visited[si][sj]=true;
        int[] dirx={0,0,1,-1};
        int[] diry={-1,1,0,0};
        for(int i=0;i<4;i++){
            int curx=si+dirx[i];
            int cury=sj+diry[i];
            if(dfs(grid,visited,curx,cury,di,dj)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] grid=new int[n][m];
		boolean[][] visited=new boolean[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        grid[i][j]=sc.nextInt();
		    }
		}
		int si=sc.nextInt();
		int sj=sc.nextInt();
		int di=sc.nextInt();
		int dj=sc.nextInt();
		if(dfs(grid,visited,si,sj,di,dj)){
		    System.out.println("yes");
		}else{
		    System.out.println("no");
		}
	}
}