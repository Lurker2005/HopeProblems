import java.util.*;
public class Array_next_greater_element {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] arr2=new int[n];
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		stack.push(arr[arr.length-1]);
		for(int i=n-1;i>=0;i--){
		    while(!stack.isEmpty()&&stack.peek()<=arr[i]){
		        stack.pop();
		    }
		    if(!stack.isEmpty()){
		        arr2[i]=stack.peek();
		    }
		    else{
		        arr2[i]=arr[i];
		    }
		    stack.push(arr[i])
		}
		for(int i=0;i<n;i++){
		    System.out.print(arr2[i]+" ");
		}
		
		

	}
}