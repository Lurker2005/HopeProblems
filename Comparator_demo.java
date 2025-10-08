import java.util.*;
public class Comparator_demo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<=9; i++) {
            map.put(i, sc.nextInt());
        }

        ArrayList<Integer> list=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list,new Comparator<Integer>() {
            public int compare(Integer a,Integer b){
                while(a!=0&&b!=0){
                    int r1=a%10;
                    int r2=b%10;
                    if(r1!=r2){
                        return Integer.compare(map.get(r1),map.get(r2));
                    }
                    a=a/10;
                    b=b/10;
                }
                return 0;

            }
        });
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}
