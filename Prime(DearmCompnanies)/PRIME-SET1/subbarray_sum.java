import java.util.*;
public class subbarray_sum {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int val=sc.nextInt();
		int left=0;int sum=0;
		for(int right=0;right<n;right++){
		    sum+=arr[right];
		    while(sum>val&&left<=right){
		        sum-=arr[left++];
		    }
		    if(sum==val){
		        System.out.println("Yes");
		        return;
		    }
		}
		System.out.println("No");

	}
}