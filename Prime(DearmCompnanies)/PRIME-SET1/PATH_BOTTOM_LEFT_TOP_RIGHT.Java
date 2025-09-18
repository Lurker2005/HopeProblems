import java.util.*;
public class PATH_BOTTOM_LEFT_TOP_RIGHT {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] grid=new int[m][n];
		int[][] count=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				grid[i][j]=sc.nextInt();
			}
		}
		Queue<int[]> queue=new LinkedList<>();
		queue.offer(new int[]{m-1,0});
		count[m-1][0]=1;
		int[] dirx={0,-1};
		int[] diry={1,0};
		while(!queue.isEmpty()){
		    int[] curij=queue.poll();
		    for(int i=0;i<dirx.length;i++){
		        int curx=curij[0]+dirx[i];
		        int cury=curij[1]+diry[i];
		        if(curx>=0&&curx<m&&cury>=0&&cury<n){
		            if(grid[curx][cury]==1){
        	            if(count[curx][cury]==0){
        	                
        	                queue.offer(new int[]{curx,cury});
        	            }
        	            count[curx][cury]+=count[curij[0]][curij[1]];
		            }
		        }
		    }
		}
		if(count[0][n-1]==0){
		    System.out.println("no");
		}
		else{
		    System.out.println("yes"+" "+count[0][n-1]);
		}

	}
}