import java.util.*;
public class N_ROOKS_FILL_REMAINING {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        byte[][] board=new byte[n][n];
        boolean[] rowblock=new boolean[n];
        boolean[] colblock=new boolean[n];
        boolean[] rooks=new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=sc.nextByte();
                if(board[i][j]==1){
                    rooks[i]=true;
                    rowblock[i]=true;
                    colblock[j]=true;
                }
            }
        }
        if(canplace(n,0,board,rowblock,colblock,rooks)){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("NotPossible");
        }
		//Your Code Here

	}
	public static boolean canplace(int n,int row,byte[][] board,boolean[] rowblock,boolean[]colblock,boolean[] rooks){
	    if(row==n){
	        return true;
	    }
	    if(rooks[row]==true){
	        return(canplace(n,row+1,board,rowblock,colblock,rooks));
	    }
	    for(int j=0;j<n;j++){
	        if(!rowblock[row]&&!colblock[j]){
	            rooks[row]=true;
	            rowblock[row]=true;
	            colblock[j]=true;
	            board[row][j]=1;
	            if(canplace(n,row+1,board,rowblock,colblock,rooks)){
	                return true;
	            }
	            else{
	                board[row][j]=0;
	                rowblock[row]=false;
	                rooks[row]=false;
	                colblock[j]=false;
	            }
	        }
	    }
	    return false;
	}
}