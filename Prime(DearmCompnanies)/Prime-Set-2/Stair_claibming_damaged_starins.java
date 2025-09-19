import java.util.*;
public class Stair_claibming_damaged_starins {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int t=sc.nextInt();
		int arr[]=new int[s];
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<s;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<t;i++){
		    set.add(sc.nextInt());
		}
		long[] dp=new long[n+1];
		dp[0]=1;
		for(int i=1;i<=n;i++){
		    for(int j=0;j<arr.length;j++){
		        if(i-arr[j]>=0&&!set.contains(i)){
		            dp[i]+=dp[i-arr[j]];
		        }
		    }
		}
		System.out.println(dp[n]);

	}
}