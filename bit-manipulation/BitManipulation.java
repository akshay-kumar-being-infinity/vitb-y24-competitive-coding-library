
class BitManipulation {

    public static long getBit(long n, int k) {
        return (n & (1 << k));
    }

    public static long setBit(long n, int k) {
        return (n | (1 << k));

    }

    public static long clearBit(long n, int k) {
        return (n & (~(1 << k)));

    }

    public static long toggleBit(long n, int k) {
        return (n ^ (1 << k));
    }

    public static int countSetBits(long n) {
        int c = 0;
        while (n > 0) {
            n = (n & (n - 1));
            c++;
        }
        return c;
    }
}
