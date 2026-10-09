class BitManipulation {
    public static long getBit(long n, int k) {
        return  ((n >> k) & 1L);
        // return 1 if the k-th bit of n is set, otherwise 0
    }

    public static long setBit(long n, int k) {
        return n | (1L << k);
        // set the k-th bit to 1
    }

    public static long clearBit(long n, int k) {
        return n & ~(1L << k);
        // set the k-th bit to 0
     }

    public static long toggleBit(long n, int k) {
        return n ^ (1L << k);
        // flip the k-th bit
    }
    
    public static void main(String[] args) {
        long n = 5; // binary: 101
        int k = 1;

        System.out.println("Get Bit: " + getBit(n, k)); // Output: 0
        System.out.println("Set Bit: " + setBit(n, k)); // Output: 7 (binary: 111)
        System.out.println("Clear Bit: " + clearBit(n, k)); // Output: 5 (binary: 101)
        System.out.println("Toggle Bit: " + toggleBit(n, k)); // Output: 7 (binary: 111)
    }
}