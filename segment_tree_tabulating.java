//JAI ADITIYA

// import java.util.*;
// public class segment_tree_tabulating  {
    // private static void printArray(int[] arr){
    //     System.out.println();
    //     System.out.println("ARRAY");
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==Integer.MAX_VALUE){
    //             System.out.print("- ");
    //             continue;
    //         }
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
//     private static int find(int[] arr, int index, int rl, int rr, int ql, int qr){
//         if(ql>rr || qr<rl){
//             return Integer.MAX_VALUE;
//         }
//         if(ql<=rl && qr>=rr){
//             return arr[index];
//         }
//         int mid=(rl+rr)/2;
//         int left=find(arr,2*index,rl,mid,ql,qr);
//         int right=find(arr,2*index+1,mid+1,rr,ql,qr);
//         return Math.min(left,right);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int size=(int)Math.pow(2,Math.ceil(Math.log(n)/Math.log(2)));
//         int arr[]=new int[size*2];
//         Arrays.fill(arr,Integer.MAX_VALUE);
//         for(int i=size;i<size+n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=size-1;i>0;i--){
//             arr[i]=Math.min(arr[i*2],arr[i*2+1]);
// //            printArray(arr);
//         }
//         printArray(arr);
//         int q=sc.nextInt();
//         while(q-->0){
//             int start=sc.nextInt();
//             int end=sc.nextInt();
//             System.out.println("Min in range: "+find(arr,1,1,n,start,end));
//         }
//     }
// }


//MEE
import java.beans.AppletInitializer;
import java.util.*;
public class segment_tree_tabulating {  
    private static void printArray(int[] arr){
        System.out.println();
        System.out.println("ARRAY");
        for(int i=0;i<arr.length;i++){
            if(arr[i]==Integer.MAX_VALUE){
                System.out.print("- ");
                continue;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static int find(int[] arr,int index,int rl,int rr,int ql,int qr){
        if(ql>rr||qr<rl){
            return Integer.MAX_VALUE;
        }
        if(ql<=rl&&qr>=rr){
            return arr[index];
        }
        int mid=(rr+rl)/2;
        int left=find(arr,2*index,rl,mid,ql,qr);
        int right=find(arr,2*index+1,mid+1,rr,ql,qr);
        return Math.min(left,right);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int length = (int)Math.ceil((Math.log(n)/Math.log(2)));
        int result = (int)Math.pow(2,length);
        System.out.println(result);


        int segment[]=new int[result*2];

        Arrays.fill(segment, Integer.MAX_VALUE);
        for(int i = 0; i < n; i++){ 
            segment[result + i] = arr[i];
        }
        
        for(int i = result - 1; i > 0; i--){
            segment[i] = Math.min(segment[2 * i], segment[2 * i + 1]);
        }
        // System.out.println(segment[1]);
        printArray(segment);

        int q=sc.nextInt();
        while(q-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Min in range: "+find(segment, 1, 1,result,a,b));

        }
        
    }
}