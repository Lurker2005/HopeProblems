import java.util.*;

public class Main {

    // Utility: Check if a string is a palindrome using two pointers
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            words[i] = sc.nextLine();
        }

        // Map: reversed string -> original index
        Map<String, Integer> reverseMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String reversed = new StringBuilder(words[i]).reverse().toString();
            reverseMap.put(reversed, i);
        }

        Set<String> uniquePairs = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = words[i];

            // Case 1: Exact reverse exists in map
            if (reverseMap.containsKey(word)) {
                int j = reverseMap.get(word);
                if (i != j) {
                    String key = i + "," + j;
                    if (!uniquePairs.contains(key)) {
                        String combined = words[i] + words[j];
                        if (isPalindrome(combined)) {
                            count++;
                            uniquePairs.add(key);
                        }
                    }
                }
            }

            // Case 2: Check for palindromic prefix/suffix matches
            for (int cut = 1; cut < word.length(); cut++) {
                String prefix = word.substring(0, cut);
                String suffix = word.substring(cut);

                // If prefix is palindrome, check for reverse of suffix
                if (isPalindrome(prefix)) {
                    String revSuffix = new StringBuilder(suffix).reverse().toString();
                    if (reverseMap.containsKey(revSuffix) && reverseMap.get(revSuffix) != i) {
                        String key = reverseMap.get(revSuffix) + "," + i;
                        if (!uniquePairs.contains(key)) {
                            count++;
                            uniquePairs.add(key);
                        }
                    }
                }

                // If suffix is palindrome, check for reverse of prefix
                if (isPalindrome(suffix)) {
                    String revPrefix = new StringBuilder(prefix).reverse().toString();
                    if (reverseMap.containsKey(revPrefix) && reverseMap.get(revPrefix) != i) {
                        String key = i + "," + reverseMap.get(revPrefix);
                        if (!uniquePairs.contains(key)) {
                            count++;
                            uniquePairs.add(key);
                        }
                    }
                }
            }
        }

        System.out.println("\nTotal palindromic pairs: " + count);
        sc.close();
    }
}
