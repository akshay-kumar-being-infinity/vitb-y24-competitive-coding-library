public static boolean isPowerOfTwo(long n) {
    // return true if n is a power of two, otherwise false
    return ((n&(n-1))==0);
}