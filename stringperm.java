import java.util.Scanner;;
public class stringperm {
    public int maxfree(String a,String b){
        int max=Integer.MIN_VALUE;
        int[][] mat=new int[a.length()][b.length()];
        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)){ 
                    mat[i][j]+=1;
                    if((i-1)>=0&&(j-1)>=0){
                        mat[i][j]+=mat[i-1][j-1];
                    }
                    max=Math.max(max, mat[i][j]);

                }
            }
        }
        return max;
    }  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stringperm st=new stringperm();
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(st.maxfree(a,b));
        sc.close();
    }  
}
