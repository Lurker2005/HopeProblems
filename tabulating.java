import java.util.*;
public class tabulating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = 0 ;
        int result = 1 ;
        while(result <n){
            length++;
            result= result<<1;
        }
        int dp[][]= new int[length][result];
        for(int i = 0 ; i< length ; i++){
        Arrays.fill(dp[i],Integer.MAX_VALUE);}
        for(int i = 0 ; i< n ; i++){
            dp[0][i]= sc.nextInt();
        }
        int count =1;
        for(int i=1; i<length;i++){
            for (int j = 0 ; j< result ; j++){
                if(dp[i-1][j+count]==Integer.MAX_VALUE){
                    break;
                }
                else{
                    dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j+count]);
                }
                System.out.print(dp[i][j]+" ");
            }
            count*=2;
            System.out.println();
        }
        int srange = sc.nextInt();
        int erange = sc.nextInt();
        int diff = erange - srange;
        result=1;
        int length1=0;
        while(result< diff){
            length1++;
            result=result<<1;
        }
        int end = erange-result;
        System.out.println(Math.min(dp[length1][srange-1], dp[length1][end]));
    }
}