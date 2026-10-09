
class BitManipulation {

    public static long getBit(long n, int k) {
        return (n & (1 << k));
    }

    public static long setBit(long n, int k) {
        return (n | (1 << k));
        // set the k-th bit to 1
    }

    public static long clearBit(long n, int k) {
        return (n & (~(1 << k)));
        // set the k-th bit to 0
    }

    public static long toggleBit(long n, int k) {
        return (n ^ (1 << k));
        // flip the k-th bit
    }
}
