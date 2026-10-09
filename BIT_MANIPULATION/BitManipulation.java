class BitManipulation {
    public static long getBit(long n, int k) {
        // return 1 if the k-th bit of n 
        return ((n>>k)&1l);
    }

    public static long setBit(long n, int k) {
        // set the k-th bit to 1
        return (n|(1l<<k));
    }

    public static long clearBit(long n, int k) {
        return (n & (~(1l<<k)));
    }

    public static long toggleBit(long n, int k) {
        return (n^(1l << k));
    }  
}