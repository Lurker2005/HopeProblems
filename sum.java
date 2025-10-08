// import java.util.*;
// public class sum{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int r=sc.nextInt();
//         int c=sc.nextInt();
//         int[] max=new int[r];
//         int[]d=new int[r];
        
//         for(int i=0;i<r;i++){
//             int ma=Integer.MIN_VALUE;
//             for(int j=0;j<c;j++){
//                 ma=Math.max(ma, sc.nextInt());

//             }
//             max[i]=ma;
//         }
//         for(int i=0;i<r;i++){
//             int ma2=max[i];
//             for(int j=i-2;j>=0;j--){
//                 ma2=Math.max(ma2, max[i]+d[j]);

//             }
//             d[i]=ma2;
//         }
//         System.out.println(Arrays.stream(d).max().getAsInt());
//     }
// }

import java.util.*;
public class sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[] max=new int[r];
        int[]d=new int[r];
        
        for(int i=0;i<r;i++){
            int ma=Integer.MIN_VALUE;
            for(int j=0;j<c;j++){
                ma=Math.max(ma, sc.nextInt());

            }
            max[i]=ma;
        }
        int evensum=0;
        int odsum=0;
        for(int row=0;row<r;row++){
            if((row+1)%2==0){
                evensum+=max[row];
            }
            else{
                odsum+=max[row];
            }

        }
        System.out.println(Math.max(evensum, odsum));
    }
}