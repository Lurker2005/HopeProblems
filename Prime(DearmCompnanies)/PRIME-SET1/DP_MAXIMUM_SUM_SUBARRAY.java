import java.util.*;
public class DP_MAXIMUM_SUM_SUBARRAY {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int maxsum=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<n;i++){
		    if(sum<0){
		        sum=0;
		    }
		    sum+=arr[i];
		    if(sum>maxsum){
		        maxsum=sum;
		    }
		    
		}
		System.out.println(maxsum);

	}
}