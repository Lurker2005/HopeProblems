// longeset substring of bgbgbg.... where the number of b and g are equal;
import java.util.*;
public class substringcounter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int balance=0;
        int max=0;
        HashMap<Integer,Integer>balancemap=new HashMap<>();
        balancemap.put(0, -1); 
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='b'){
                balance++;
            }
            else if (str.charAt(i)=='g'){
                balance--;
            }
            if(balancemap.containsKey(balance)){
                int previouslength=balancemap.get(balance);
                int length=i-previouslength;
                max=Math.max(max, length);
            }else{
                balancemap.put(balance,i);
            }
        }
        System.out.println(max);
        sc.close();
    }
}
