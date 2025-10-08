import java.util.*;
public class oddoneout {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(char a:map.keySet()){
            if(map.get(a)==1){
                System.out.println(a);
            }
        }
    }

}
