
import java.util.*;
public class Stock_buy_and_cell_once {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int minprice=arr[0];
		int maxprofit=0;
		for(int i=1;i<n;i++){
		    if(arr[i]>minprice){
		        maxprofit=Math.max(maxprofit,(arr[i]-minprice));
		    }
		    else{
		        minprice=arr[i];
		    }
		}
		System.out.println(maxprofit);

	}
}