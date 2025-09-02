import java.util.*;

public class DP_CONSONANTS_SLIDING_WINDOW {
    public static void main(String[] args){
        Scanner sc=new SScanner(System.in);
        import java.util.*;

        int k = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine().toLowerCase();

        HashSet<Character> vov = new HashSet<>(Set.of('a','e','i','o','u'));
        int n = str.length();
        int count = 0;

        for (int i = 0; i < k; i++) {
            if (!vov.contains(str.charAt(i))) count++;
        }
        System.out.print(count + " ");

        for (int i = k; i < n; i++) {
            if (!vov.contains(str.charAt(i - k))) count--;
            if (!vov.contains(str.charAt(i))) count++;
            System.out.print(count + " ");
        }
    }
}

    