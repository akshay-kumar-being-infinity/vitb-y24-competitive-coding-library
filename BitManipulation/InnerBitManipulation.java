package BitManipulation;

class BitManipulation {
    public static long getBit(long n, int k) {
        
       return (n >> k) & 1;//to get the kth bit of n.
    }

    public static long setBit(long n, int k) {
        
       return n | (1L << k);
    }

    public static long clearBit(long n, int k) {
        
     return n & ~(1L << k);
    }
  
    public static long toggleBit(long n, int k) {
        
        return n ^ (1L << k);
    }
    public static boolean isPowerOfTwo(long n) {
    // return true if n is a power of two, otherwise false
        return n > 0 && (n & (n - 1)) == 0;
    }
}