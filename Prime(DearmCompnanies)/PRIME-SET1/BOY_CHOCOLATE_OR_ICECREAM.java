import java.util.*;
public class BOY_CHOCOLATE_OR_ICECREAM {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long n1=2;
		long n2=3;
		if(n==1){
		    System.out.println(n1);
		}
		else if(n==2){
		    System.out.println(n2);
		}
		else{
		    for(long i=3;i<=n;i++){
		        long sum=n1+n2;
		        n1=n2;
		        n2=sum;
		    }
		    System.out.println(n2);
		}

	}
}