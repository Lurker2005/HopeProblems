import java.util.*;
public class Stair_climbing_slippery_stairs {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int t=sc.nextInt();
		int[] arr=new int[s];
		Stack<Integer>st =new Stack<>();
		long[] dp=new long[n+1];
		for(int i=0;i<s;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<t;i++){
		    st.add(sc.nextInt());
		}
		dp[0]=1;
		for(int i=1;i<=n;i++){
		    for(int j=0;j<arr.length;j++){
		        if(i-arr[j]>=0){
		            dp[i]+=dp[i-arr[j]];
		        }
		    }
		    if(st.contains(i)){
		        int non=i-1;
		        while(st.contains(non)&&non>0){
		            non--;
		        }
		        if(non>0){
		            dp[non]+=dp[i];
		        }
		        dp[i]=0;
		    }
		}
		System.out.println(dp[n]);

	}
}