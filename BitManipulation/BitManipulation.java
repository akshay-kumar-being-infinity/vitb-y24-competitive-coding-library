
class BitManipulation {

    public static long getBit(long n, int k) {
        return((n>>k)&1);
    }

    public static long setBit(long n, int k) {
        return (n|(1L<<k));
    }

    public static long clearBit(long n, int k) {
        return (n & ~(1L<<k));
    }

    public static long toggleBit(long n, int k) {
        return (n^(1L<<k));
    }
    public static boolean isPowerOfTwo(long n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static int countSetBit(int n) {
    int count = 0;

    while (n > 0) {
        count += (n & 1);
        n = n >> 1;
    }

    return count;
}
}
