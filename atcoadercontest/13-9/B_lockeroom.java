    import java.util.*;

    public class B_lockeroom {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] ls = new int[n];
            
            for (int i = 0; i < n; i++) {
                ls[i] = sc.nextInt();
            }

            int left = 0, right = n - 1;


            while (left < n && ls[left] == 0) {
                left++;
            }


            while (right >= 0 && ls[right] == 0) {
                right--;
            }


            int remaining = Math.max(0, right - left);
            System.out.println(remaining);
        }
    }
