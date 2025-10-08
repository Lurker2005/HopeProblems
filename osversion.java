import java.util.*;

class osversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"Ocelot", "Serval", "Serval"};
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        int pos1 = -1;
        int pos2 = -1;
        

        for(int i = 0; i < str.length; i++) {
            if(str[i].equals(str1) && pos1 == -1) {
                pos1 = i;
            }
            if(str[i].equals(str2) && pos2 == -1) {
                pos2 = i;
            }
        }
        
  
        if(pos1 != -1 && pos2 != -1 && pos1 <= pos2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}