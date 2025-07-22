import java.util.*;

public class MedianFinder {
    private Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private Queue<Integer> minHeap = new PriorityQueue<>();

    public void addNum(int num) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }

        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        } else if (maxHeap.size() - minHeap.size() > 1) {
            minHeap.offer(maxHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (double) (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
        return (double) maxHeap.peek();
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to add to the data stream (type 'exit' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int num = Integer.parseInt(input); // Parse the input as an integer
                medianFinder.addNum(num);
                System.out.println("Current Median: " + medianFinder.findMedian());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'exit' to stop.");
            }
        }
        scanner.close();
        System.out.println("Program terminated.");
    }
}
