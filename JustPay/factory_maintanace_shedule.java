import java.util.*;
public class factory_maintanace_shedule {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int num=sc.nextInt();
        int[] ot=new int[num];
        int achive=0;
        for (int i=0;i<num;i++){
            ot[i]=sc.nextInt();
            achive+=ot[i];
        }
        int[] rest=new int[num];
        PriorityQueue<int[]> minheap=new PriorityQueue<>((a,b)->{return a[0]-b[0];});
        for(int i=0;i<num;i++){
            rest[i]=sc.nextInt();
            minheap.add(new int [] {rest[i]+1,i});
        }
        
        int day=1;
        while(achive<t){
            int[] nxt=minheap.poll();
            int curday=nxt[0];
            day=curday;
            int ind=nxt[1];
            minheap.add(new int[]{curday+rest[ind],ind});
            achive+=ot[ind];
        }
        System.out.println(day);
        sc.close();
    }
        
}
