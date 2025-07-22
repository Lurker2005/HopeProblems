import java.util.*;
public class pairwise {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("give the number of values in the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.printf("Enter number %d: ", i + 1);
            arr[i] = sc.nextInt();

        }
        HashMap<Integer,Integer>dict=new HashMap<>();
        for(int num:arr){
            dict.put(num % 10, dict.getOrDefault(num % 10, 0) + 1);
        }
        int count = 0;

        int[][] validPairs = {
            {0, 0},
            {1, 9},
            {2, 8},
            {3, 7},
            {4, 6},
            {5, 5}
        };

        for (int[] pair : validPairs) {
            int a = pair[0];
            int b = pair[1];

            if (a == b) {
                if (dict.containsKey(a)) {
                    int freq = dict.get(a);
                    count += (freq * (freq - 1)) / 2; 
                }
            } else {
                if (dict.containsKey(a) && dict.containsKey(b)) {
                    count += dict.get(a) * dict.get(b);
                }
            }
        }
        System.out.println(count);
        sc.close();

    }
}
