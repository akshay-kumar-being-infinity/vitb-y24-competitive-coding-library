public class BitManipulation {
    //BitManipulation class provides utility methods for bit manipulation operations on long integers.
    /**
     * Returns 1 if the k-th bit of n is set (0-indexed), otherwise 0.
     */
    public static long getBit(long n, int k) {
        return (n >> k) & 1L;
    }

    /**
     * Sets the k-th bit of n to 1 (0-indexed).
     */
    public static long setBit(long n, int k) {
        return n | (1L << k);
    }

    /**
     * Sets the k-th bit of n to 0 (0-indexed).
     */
    public static long clearBit(long n, int k) {
        return n & ~(1L << k);
    }

    /**
     * Flips the k-th bit of n (0-indexed).
     */
    public static long toggleBit(long n, int k) {
        return n ^ (1L << k);
    }
}
