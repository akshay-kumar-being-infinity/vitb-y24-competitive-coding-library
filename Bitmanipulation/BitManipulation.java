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
    public static int countSetBits(long n) {
    // return the number of bits set to 1 in n (n >= 0)
        int count=0;
        while(n>0){
            count+=n&1;
            n=n>>1;
        }
        return count;
}
}