import java.util.*;
public class Remove_adjesent_eqal_value {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<n;i++){
		    if(!stack.isEmpty()){
		        int a=sc.nextInt();
		        if(a!=stack.peek()){
		            stack.push(a);
		        }
		        else{
		            stack.pop();
		        }
		    }
		    else{
		        stack.push(sc.nextInt());
		    }
		}
		if(!stack.isEmpty()){
    		for(int obj:stack){
    		    System.out.print(obj+" ");
    		}
		}
		else{
		    System.out.println(-1);
		}
	}
}