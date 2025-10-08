import java.util.*;

public class Deck_of_cards_optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int count0 = 0, count1 = 0, count2 = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') count0++;
                else if (c == '1') count1++;
                else count2++;
            }

            char[] result = new char[n];
            Arrays.fill(result, '+');


            for (int i = 0; i < count0; i++) {
                result[i] = '-';
            }
            for (int i = 0; i < count1; i++) {
                result[n - 1 - i] = '-';
            }


            int leftUncertainStart = count0;
            int leftUncertainEnd = Math.min(count0 + count2 - 1, n - count1 - 1);
            for (int i = leftUncertainStart; i <= leftUncertainEnd; i++) {
                if (result[i] == '+') {
                    result[i] = '?';
                }
            }

            int rightUncertainStart = Math.max(n - count1 - count2, count0);
            int rightUncertainEnd = n - count1 - 1;
            for (int i = rightUncertainStart; i <= rightUncertainEnd; i++) {
                if (result[i] == '+') {
                    result[i] = '?';
                }
            }

            System.out.println(new String(result));
        }
        sc.close();
    }
}
