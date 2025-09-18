import java.util.*;
public class Array_majarity_elemt {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> hmap=new HashMap<>();
		int max=Integer.MIN_VALUE;
		int maxval=-1;
		for(int i=0;i<n;i++){
		    int n1=sc.nextInt();
		    hmap.put(n1,hmap.getOrDefault(n1,0)+1);
		    if(hmap.get(n1)>max){
		        max=hmap.get(n1);
		        maxval=n1;
		    }
		}
		if (max>n/2){
		    System.out.println(maxval);
		}
		else{
		    System.out.println("No Majority Element");
		}

	}
}