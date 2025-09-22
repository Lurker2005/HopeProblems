import java.util.*;
public class stock_buy_or_SEll_Multuple_times {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int profit=0;
		for(int i=1;i<n;i++){
		    if(arr[i]>arr[i-1]){
		        profit+=(arr[i]-arr[i-1]);
		    }
		}
		System.out.println(profit);
	}
}