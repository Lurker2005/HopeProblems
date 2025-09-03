import java.util.*;
public class BOYS_ICECREAM_KTH_DAY {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long k =sc.nextInt();
		long n1=1;
		long n2=1;
		long sum=2;
		for(long i=2;i<=n;i++){
		    if(i%k==0){
		        long temp=n1;
		        n1=n1+n2;
		        n2=n2+temp;
		    }
		    else{
		        long temp=n1;
		        n1=n1+n2;
		        n2=temp;
		    }
		}
		System.out.println(n1+n2);

	}
}