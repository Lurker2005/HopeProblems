import java.util.*;
public class Deck_of_Cards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int k=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            for(int j=0;j<k;j++){
                int p1=0;
                int p2=n-1;
                while(arr[p1]!=0||arr[p2]!=0&&p1<p2){
                    if(arr[p1]!=0){
                        p1++;
                    }
                    if(arr[p2]!=0){
                        p2--;
                    }
                }
                if(s.charAt(j)=='0'){
                    arr[p1]=1;
                }
                else if(s.charAt(j)=='1'){
                    arr[p2]=1;
                }
                else if(s.charAt(j)=='2'){
                    arr[p1]=2;
                    arr[p2]=2;
                    // arr[p1]=1;
                }
            }
            for(int j=0;j<n;j++){
                if(arr[j]==0){
                    System.out.print("+");
                }
                else if(arr[j]==1){
                    System.out.print("-");
                }
                else if(arr[j]==2){
                    System.out.print("?");
                }

            }
            System.out.println();
        }
    }
}
