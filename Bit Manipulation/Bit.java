class BitManipulation {
    public static long getBit(long n, int k) {
        // return 1 if the k-th bit of n is set, otherwise 0
        return ((n>>k)&1L);
    }

    public static long setBit(long n, int k) {
        // set the k-th bit to 1
        n = (n|(1L<<k));
        return n;
    }

    public static long clearBit(long n, int k) {
        // set the k-th bit to 0

        n = (n&(~(1L<<k)));
        return n;
    }

    public static long toggleBit(long n, int k) {
        // flip the k-th bit
        n = ((n>>k)^1L);
        return n;
    }
}