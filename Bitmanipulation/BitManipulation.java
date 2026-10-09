class BitManipulation {
    public static long getBit(long n, int k) {
        return ((n>>k)&1L);
    }

    public static long setBit(long n, int k) {
        n=((1L<<k)|n);
        return n;
    }

    public static long clearBit(long n, int k) {
        n=(n&~(1L<<k));
        return n;
    }

    public static long toggleBit(long n, int k) {
        n=(n^(1L<<k));
        return n;
    }

    public static boolean isPowerOfTwo(long n) {
        // if set bit count is 1, then n is a power of two
        return (n>0 && (n&(n-1))==0);
    }
}