// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class OS_VERSION {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str={"Ocelot","Serval","Serval"};
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        boolean flag=false;
        for(int i=0;i<2;i++){
            if(str1==str[i]){
                flag=true;
            }
            if(str2==str[i]){
                if(flag==false){
                    System.out.println("No");
                    return ;
                }
            }
        }
        System.out.println("Yes");
    }
}