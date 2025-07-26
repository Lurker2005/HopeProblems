import java.util.*;

public class customer_satisfaction_level {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int i=0;
        while(i < k){
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            int g=sc.nextInt();
            int st=0;

            while(st <= n - g) { 
                TreeMap<Integer,Integer> tm = new TreeMap<>();

                for(int j=st; j<st+g; j++){
                    tm.put(arr[j], tm.getOrDefault(arr[j], 0)+1);
                }

 

            
                minHeap.add(tm.lastKey());

                st++;
            }

           
            System.out.println(minHeap.peek());

            i++;
        }
        sc.close();
    }
}
