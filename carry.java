import java.util.*;

public class carry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int carry = 0;
        String str="";

        while (n1 != 0 || n2 != 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int sum = d1 + d2 + carry;

            if (sum >= 10) {
                carry = 1;
                str=carry+str;
            } else {
                carry = 0;
            }

            n1 = n1 / 10;
            n2 = n2 / 10;
        }

        System.out.println(str.trim());
        sc.close();
    }
}
