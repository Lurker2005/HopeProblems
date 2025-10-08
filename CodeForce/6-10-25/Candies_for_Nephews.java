import java.util.*;
public class Candies_for_Nephews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            
            // Find minimum candies to add so total is divisible by 3
            int remainder = n % 3;
            int candies_to_buy = (remainder == 0) ? 0 : (3 - remainder);
            
            System.out.println(candies_to_buy);
        }
    }
}