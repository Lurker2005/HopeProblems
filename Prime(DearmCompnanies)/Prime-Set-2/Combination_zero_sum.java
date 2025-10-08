import java.util.*;
public class Combination_zero_sum  {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int counter=0;
		for(int i=1;i<(1<<n);i++){
		    int sum=0;
		    for(int j=0;j<n;j++){
		        if((i&(1<<j))!=0){
		            sum+=arr[j];
		        }
		    }
		    if(sum==0){
		        counter++;
		    }
		}
		System.out.println(counter);

	}
}