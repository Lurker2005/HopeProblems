//will give n to you and you have to genrate a nrow and n coloum cube like thi sif nn=5 then genrate 1,2,3,4,5,
                                                                                                    //  10,9,8,7,6
                                                                                                    //  11,12,13,14,15
                                                                                                    //  20,19,18,17,16
                                                                                                    //  21,22,23,24,25
                                                                                                     
import java.util.Scanner;

public class ncube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int num = 1;  // Start from 1

        for (int row = 0; row < n; row++) {
            int[] temp = new int[n];

            // Fill the row with values
            for (int col = 0; col < n; col++) {
                temp[col] = num++;
            }

            // Print row based on direction
            if (row % 2 == 0) {
                // left to right
                for (int col = 0; col < n; col++) {
                    System.out.print(temp[col] + " ");
                }
            } else {
                // right to left
                for (int col = n - 1; col >= 0; col--) {
                    System.out.print(temp[col] + " ");
                }
            }

            System.out.println(); // Move to next row
        }

        sc.close();
    }
}
