import java.util.*;
public class DP_EQUAL_COUNT_VOWEL_CONSONANT {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();
		int n=sc.nextInt();
		int vovcount=0;
		int conscount=0;
		int count=0;
		HashSet<Character> vov=new HashSet<>(Set.of('a','e','i','o','u'));
		for(int i=0;i<n;i++){
		    if(vov.contains(str.charAt(i))){
		        vovcount++;
		    }
		    else{
		        conscount++;
		    }
		}
		if(vovcount==conscount){
		    count++;
		}
		
		for(int i=n;i<str.length();i++){
		    if(vov.contains(str.charAt(i))){
		        vovcount++;
		    }
		    else{
		        conscount++;
		    }
		    if(vov.contains(str.charAt(i-n))){
		        vovcount--;
		    }
		    else{
		        conscount--;
		        
		    }
		    if(vovcount==conscount){
		        count++;
		    }
		}
		System.out.println(count);
		

	}
}