class BitManipulation {
    public static long getBit(long n, int k) {
        // return 1 if the k-th bit of n is set, otherwise 0
        return ((n>>k)&1);
    }

    public static long setBit(long n, int k) {
        // set the k-th bit to 1
        return (n|(1<<k));
    }

    public static long clearBit(long n, int k) {
        // set the k-th bit to 0
        return (n&(~(1<<k)));
    }

    public static long toggleBit(long n, int k) {
        // flip the k-th bit
        return (n^(1<<k));
        
    }
}