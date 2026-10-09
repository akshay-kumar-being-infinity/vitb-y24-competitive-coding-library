public class BitManipulation {
    public static long setBit( long n, long k) {
        return (n | (1L << k));
    }
    public static long clearBit(long n, long k) {
        return (n & ~(1L << k));
    }
    public static long toggleBit(long n, long k) {
        return (n ^ (1L << k));
    }
    public static long getBit(long n, long k) {
        return ((n >> k)&1L);
    }
}