class BitManipulation {
    public static long getBit(long n, int k) {
        // return 1 if the k-th bit of n is set, otherwise 0
        return ((1L << k) & n) != 0 ? 1 : 0;
    }
    
    public static long setBit(long n, int k) {
        // set the k-th bit to 1
        return ((1L<<k)|n);
    }
    
    public static long clearBit(long n, int k) {
        // set the k-th bit to 0
        return ((~(1L<<k))&n);
    }
    
    public static long toggleBit(long n, int k) {
        // flip the k-th bit
        return ((1L<<k)^n);
    }
}