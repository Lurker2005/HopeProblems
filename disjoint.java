import java.util.*;

public class disjoint{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int[][] adjMat = new int[E][2];
        int max=0;

        for(int i=0; i<E; i++){
            adjMat[i][0] = sc.nextInt();
            adjMat[i][1] = sc.nextInt();
            max = Math.max(max, Math.max(adjMat[i][0], adjMat[i][1]));
        }

        int[] leader = new int[max+1];

        for(int i=0; i<=max; i++)
            leader[i] = i;
        
        for(int i=0; i<E; i++){
            join(adjMat[i][0], adjMat[i][1], leader); 
        }

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<=max; i++)
            set.add(getLeader(i, leader));
        
        System.out.println(set.size());
        for(int i=0; i<=max; i++){
          getLeader(i, leader);
        }
        for(int i=0; i<=max; i++){
            System.out.println("Leader of "+i +" is " + getLeader(i, leader));
        }
        
        sc.close();
    }
    private static int getLeader(int node, int[] leaders){
        if(leaders[node] == node)
            return leaders[node];
        
        leaders[node] = getLeader(leaders[node], leaders);
        return leaders[node];
    }
    private static void join(int left, int right, int[] leader){
        int leftLead = getLeader(left, leader);
        int rightLead = getLeader(right, leader);

        if(leftLead != rightLead)
            leader[rightLead] = leftLead;
    }
}