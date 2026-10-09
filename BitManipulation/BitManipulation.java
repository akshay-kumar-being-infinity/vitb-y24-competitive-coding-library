class BitManipulation {
    public static long getBit(long n, int k) {
        return ((n >> k) & 1);
    }

    public static long setBit(long n, int k) {
        return (n & (1L << k));
    }

    public static long clearBit(long n, int k) {
        return (n & (~(1L << k)));
    }

    public static long toggleBit(long n, int k) {
        return (n ^ (1L << k));
    }

    public static void main(String[] args) {
        long n = 5;
        int k = 1;
        System.out.println(getBit(n, k));
    }
}