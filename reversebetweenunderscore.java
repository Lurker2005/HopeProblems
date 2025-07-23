
public class reversebetweenunderscore {
    public static void main(String[] args){
        String str="_arps_grmt_hello_";
        StringBuilder result=new StringBuilder();
        String[] parts=str.split("_");
        for (int i = 0; i < parts.length; i++) {
            if (i != 0) {
                result.append("_");
            }
            String reversed = new StringBuilder(parts[i]).reverse().toString();
            result.append(reversed);
        }
        if(str.endsWith("_")){
            result.append("_");
        }
        System.out.println(result.toString());

    }
    
}
