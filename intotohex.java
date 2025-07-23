import java.util.*;
public class intotohex {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
                 'A', 'B', 'C', 'D', 'E', 'F'};

        int n=sc.nextInt();
        String s="";
        while(n!=0){
            s=arr[(n%16)]+s;
            n=n/16;

        }
        System.out.println(s);
        sc.close();

    }
    
}
