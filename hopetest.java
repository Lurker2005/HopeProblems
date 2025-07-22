import java.util.*;

public class hopetest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n, k, x in order:");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[n * k];

        System.out.println("Enter the values inside the array:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter value at index %d: ", i);
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < (n * k); i++) {
            arr2[i] = arr[i % n];
        }

        Set<String> seen = new HashSet<>();
        int count = 0;

        for (int i = 0; i < arr2.length; i++) {
            int sum = 0;
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < arr2.length; j++) {
                sum += arr2[j];
                sb.append(arr2[j]).append(",");

                if (sum >= x && seen.add(sb.toString())) {
                    count++;

                }
            }
        }

        System.out.println("Count of distinct subarrays with sum >= x: " + count);
        sc.close();
    }
}
