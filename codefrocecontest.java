import java.util.Scanner;

public class codefrocecontest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 
            int c = sc.nextInt(); 
            int d = sc.nextInt(); 

            int firstHalfRiOI = a;
            int firstHalfKDOI = b;
            int secondHalfRiOI = c - a;
            int secondHalfKDOI = d - b;

            if (isValidHalf(firstHalfRiOI, firstHalfKDOI) && isValidHalf(secondHalfRiOI, secondHalfKDOI)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

    static boolean isValidHalf(int x, int y) {
        int maxGoals = Math.max(x, y);
        int minGoals = Math.min(x, y);


        return maxGoals <= 2 * (minGoals + 1);
    }
}
