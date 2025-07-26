import java.util.*;
public class atcoaderprob3 {
    static List<String> results = new ArrayList<>();

    public static void generateCombinations(String[] strings, String current, int depth, int K) {
        if (depth == K) {
            results.add(current);
            return;
        }

        for (int i = 0; i < strings.length; i++) {
            generateCombinations(strings, current + strings[i], depth + 1, K);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int K=sc.nextInt();
        int x=sc.nextInt();
        sc.nextLine();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        generateCombinations(str, "", 0, K);
        Collections.sort(results);
        System.out.println(results.get(x-1));
        sc.close();


    }
    
}
