import java.util.*;
public class test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] count = new int[20000];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>0){
                count[arr[i]]++;
            }
        }
        for(int i=1;i<20000;i++){
            if (count[i]==0){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }

}

