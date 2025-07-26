import java.util.*;

public class atcoadertestprob1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        int l = sc.nextInt();  
        int r = sc.nextInt();  
        sc.nextLine();         
        String s = sc.nextLine(); 

        boolean b = true;
        for (int i = l - 1; i <= r - 1; i++) {  
            if (s.charAt(i) != 'o') {
                b = false;
                break;
            }
        }

        if (b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}
