import java.util.*;
public class Longest_common_signal {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=sc.nextLine();
		int[][] dp=new int[str.length()+1][str2.length()+1];
		for(int i=0;i<str.length();i++){
		    dp[i][0]=0;
		}
		for(int i=0;i<str2.length();i++){
		    dp[0][i]=0;
		}
		int max=Integer.MIN_VALUE;
		for(int i=1;i<=str.length();i++){
		    for(int j=1;j<=str2.length();j++){
		        if(str.charAt(i-1)==str2.charAt(j-1)){
		            dp[i][j]=1+dp[i-1][j-1];
		            max=Math.max(max,dp[i][j]);
		        }
		    }
		}
		System.out.println(max);

	}
}