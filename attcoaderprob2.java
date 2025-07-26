import java.util.*;

public class attcoaderprob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] t = s.toCharArray();
        boolean canPlaceO = true; 

        for (int i = 0; i < t.length; i++) {
            if (t[i] == '#') {

                canPlaceO = true; 
            } else if (t[i] == '.' && canPlaceO) {
                t[i] = 'o';       
                canPlaceO = false; 
            }
        }

        System.out.println(new String(t));
        sc.close();
    }
}
