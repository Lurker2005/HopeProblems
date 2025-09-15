import java.util.*;

public class C_lockalldoors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int room = sc.nextInt();
        int[] lock = new int[N];
        for (int i = 0; i < N; i++) {
            lock[i] = sc.nextInt();
        }

        int toggles = 0;

        // Left side
        int zerobef = 0;
        for (int di = 0; di < room; di++) {
            if (lock[di] == 1) {
                if (zerobef == 1) {
                    toggles += 2;
                }
            } else {
                zerobef = 1;
                toggles += 1;
            }
        }

        // Right side
        int zeroafter = 0;
        for (int di = N - 1; di >= room; di--) {
            if (lock[di] == 1) {
                if (zeroafter == 1) {
                    toggles += 2;
                }
            } else {
                toggles += 1;
                zeroafter = 1;
            }
        }

        System.out.println(toggles);
    }
}
