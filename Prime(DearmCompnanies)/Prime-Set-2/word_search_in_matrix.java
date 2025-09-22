import java.util.*;
public class word_search_in_matrix {

    public static boolean dfs (char[][] letters,String word,int i,int j,int counter,boolean[][] visited){
        int n=letters.length,m=letters[0].length,l=word.length();
        
        if(counter == word.length()) return true;
        
        if(i<0||i>=n||j<0||j>=m||visited[i][j]||letters[i][j]!=word.charAt(counter)){
            return false;
        }

        visited[i][j]=true;
        int[] dirx={0 ,0,-1,1};
        int[] diry={-1,1, 0,0};
        for(int k=0;k<4;k++){
            int curx=i+dirx[k];
            int cury=j+diry[k];
            if(dfs(letters,word,curx,cury,counter+1,visited)){
                return true;
            }
        }
        visited[i][j]=false;
        return false;
        
    }
    public static void main(String[] args){
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.nextLine();
		char[][] letters=new char[n][m];
// 		boolean[][] visited=new boolean[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        letters[i][j]=sc.next().charAt(0);
		    }
		    sc.nextLine();
		}
		String word=sc.next();
		int counter=0;
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        if(letters[i][j]==word.charAt(0)){
		            boolean[][] visited=new boolean[n][m];
		            if(dfs(letters,word,i,j,counter,visited)){
		                System.out.println("yes");
		                return;
		            }
		        }
		    }
		}
		System.out.println("no");

	}
}