import java.util.*;
public class KMP_ALGORITHAM {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int[] ls=new int[str2.length()];
		int j=0;
		int counter=-1;
		for(int i=0;i<ls.length;i++){
		    if(str2.charAt(i)==str2.charAt(j)){
		        ls[i]=++counter;
		    }
		    else{
		        if(str2.charAt(i)==str2.charAt(0)){
		            ls[i]=1;
		            counter=1;
		        }
		        else{
		            ls[i]=0;
		            counter=0;
		        }
		    }
		    
		}
        for(int i=0;i<ls.length;i++){
            System.out.print(ls[i]+" ");
        }
        System.out.println();
		int k=0;
		int count=0;
		for(int i=0;i<str1.length();i++){
		    if(k==str2.length()){
		        count++;
		        k=0;
		    }
		    if(str1.charAt(i)==str2.charAt(k)){
		        k++;
		    }
    		    else{
    		        if(k>0){
        		        if(str1.charAt(i)==str2.charAt(ls[k-1])){
        		            k=ls[k];
        		        }
        		        else{
        		            k=0;
        		            
        		        }
    		        }
    		    }
		}
		System.out.println(count);

	}
}