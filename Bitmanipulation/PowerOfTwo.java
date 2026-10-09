public class PowerOfTwo {
    public static boolean isPowerOfTwo(long n) {
    // return true if n is a power of two, otherwise false
    return n > 0 && (n & (n - 1)) == 0;
 }
}
