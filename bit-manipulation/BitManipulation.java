
class BitManipulation {
    public static long getBit(long n, int k) {
        // Return the k-th bit (0 or 1)
        return (n >> k) & 1L;
    }

    public static long setBit(long n, int k) {
        // Set the k-th bit to 1
        return n | (1L << k);
    }

    public static long clearBit(long n, int k) {
        // Set the k-th bit to 0
        return n & ~(1L << k);
    }

    public static long toggleBit(long n, int k) {
        // Flip the k-th bit
        return n ^ (1L << k);
    }
}
