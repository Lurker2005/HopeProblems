import java.util.*;
public class NBISHOP_FILL_REMAINING {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		byte[][] board=new byte[n][n];
		boolean[] swdiag=new boolean[2*n-1];
		boolean[] nwdiag=new boolean[2*n-1];
		boolean[] bishop=new boolean[n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        board[i][j]=sc.nextByte();
		        if(board[i][j]==1){
		            bishop[i]=true;
		            swdiag[j-i+n-1]=true;
		            nwdiag[i+j]=true;
		        }
		    }
		}
		if(canplace(n,0,board,swdiag,nwdiag,bishop)){
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

	}
	public static boolean canplace(int n,int row,byte[][]board,boolean[]swdiag,boolean[] nwdiag,boolean[] bishop){
	    if(row==n){
	        return true;
	    }
	    if(bishop[row]){
	        return canplace(n,row+1,board,swdiag,nwdiag,bishop);
	    }
	    for(int j=0;j<n;j++){
	        if(!swdiag[j-row+n-1]&&!nwdiag[j+row]){
	            board[row][j]=1;
	            swdiag[j-row+n-1]=true;
	            nwdiag[j+row]=true;
	            bishop[row]=true;
	            if(canplace(n,row+1,board,swdiag,nwdiag,bishop)){
	                return true;
	            }
	            else{
	                board[row][j]=0;
	                swdiag[j-row+n-1]=false;
	                nwdiag[j+row]=false;
	                bishop[row]=false;
	            }
	        }
	    }
	    return false;
	}
}