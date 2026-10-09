class BitManipulation {
    public static long getBit(long n, int k) {
        return ((n >> k) & 1);
    }

    public static long setBit(long n, int k) {
        return (n & (1L << k));
    }

    public static long clearBit(long n, int k) {
        return (n & (~(1L << k)));
    }

    public static long toggleBit(long n, int k) {
        return (n ^ (1L << k));
    }
}