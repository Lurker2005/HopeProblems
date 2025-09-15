import java.util.*;
public class scareefee {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        for(int i=(n/1000)*1000;i>=0;i-=1000){
            double amt=i*(x/1000.0);
            if((i+amt)<=n){
                System.out.println(i);
                return;
            }
        }
    }
}
