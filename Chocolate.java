import java.util.*;

public class Chocolate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            maxHeap.add(sc.nextInt());
        }

        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int max = maxHeap.poll();
             // more efficient than peek + remove
            if (max%2!=0){
                max++;
            }
            maxHeap.add(max / 2);
        }

        // Option 1: print sum of remaining chocolates
        int total = 0;
        while (!maxHeap.isEmpty()) {
            total += maxHeap.poll();
        }
        System.out.println("Total remaining: " + total);
        
        // Option 2: print final heap (sorted)
        // List<Integer> result = new ArrayList<>(maxHeap);
        // Collections.sort(result, Collections.reverseOrder());
        // System.out.println("Final heap: " + result);

        sc.close();
    }
}
