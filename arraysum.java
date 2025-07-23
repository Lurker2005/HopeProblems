import java.util.*;
public class arraysum{
    public static void main(String[] args){
        int[] arr={10,5,6,7,2,9};
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr2.length;i++){
            if(i==0){
                arr2[i]=arr[i+1];
            }
            else if(i==(arr2.length-1)){
                arr2[i]=arr[i-1];
            }
            else{
                arr2[i]=arr[i-1]+arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}