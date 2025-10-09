import java.io.*;
import java.util.*;
public class HotelQuries {
    public static int query(int[]arr ,int q,int ind,int start,int end){
        if(arr[ind]<q){
            return 0;
        }
        if(start==end){
            arr[ind]-=q;
            return start;
        }
        int mid=(start+end)/2;
        int left=query(arr,q,ind*2,start,mid);
        if(left!=0){
            arr[ind]=Math.max(arr[ind*2],arr[ind*2+1]);
            return left;
        }
        int right=query(arr, q, ind*2+1,mid+1,end);
        if(right!=0){
            arr[ind]=Math.max(arr[ind*2],arr[ind*2+1]);
            return right;

        }
        return 0;

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int q=Integer.parseInt(st.nextToken());
        int result=(int)Math.pow(2,Math.ceil(Math.log(n)/Math.log(2)));
        int[] arr=new int[result*2];
    
        st=new StringTokenizer(br.readLine());
        for(int j=0;j<n;j++){
            arr[j+result]=Integer.parseInt(st.nextToken());
        }   
        for(int i=result-1;i>0;i--){
            arr[i]=Math.max(arr[i*2],arr[i*2+1]);

        }
        st=new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        while(st.hasMoreTokens()){
            int q1=Integer.parseInt(st.nextToken());
            sb.append(query(arr, q1, 1, 1, result)).append(" ");

        }
        System.out.print(sb);



        

        

    }
}
