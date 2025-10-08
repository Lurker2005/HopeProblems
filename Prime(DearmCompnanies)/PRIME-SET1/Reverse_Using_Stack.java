import java.util.Scanner;
import java.util.Stack;

public class Reverse_Using_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int currVal = sc.nextInt();
            stack.push(currVal);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
