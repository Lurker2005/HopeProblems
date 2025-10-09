
import java.util.*;
public class Maximum_sum_k_cross_k_subarray {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][]arr=new int[n][n];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		        
		    }
		}
		int[][] prefix=new int[n][n];
		int k=sc.nextInt();
		for(int i=0;i<k;i++){
		    for(int j=0;j<k;j++){
		        prefix[i][j]=arr[i][j]+(i>0?arr[i-1][j]:0)+(j>0?arr[i][j-1])-(i>0&&j>0?arr[i-1][j-1]);
		        
		    }
		}
		System.out.println(prefix[n-1][n-1]);
	}
}