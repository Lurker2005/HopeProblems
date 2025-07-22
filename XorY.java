public class XorY {
    public static void main(String[] args) {
        int mod = 100;

        for (int y = 0; y < mod; y++) {
            for (int x = 0; x < mod; x++) {
                if (x == (y ^ x)) {
                    System.out.println("x = " + x + ", y = " + y);
                }
            }
        }
    }
    
}
