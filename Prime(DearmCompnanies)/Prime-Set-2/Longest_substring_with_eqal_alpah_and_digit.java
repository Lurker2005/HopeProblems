import java.util.*;
public class Longest_substring_with_eqal_alpah_and_digit {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0,-1);
		int diff=0;
		int maxlen=0;
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(!Character.isDigit(ch)){
		        diff++;
		    }
		    else if(Character.isDigit(ch)){
		        diff--;
		    }
		    if(map.containsKey(diff)){
		        int previndex=map.get(diff);
		        maxlen=Math.max(maxlen,i-previndex);
		    }
		    else{
		        map.put(diff,i);
		    }
		}
		System.out.println(maxlen);

	}
}