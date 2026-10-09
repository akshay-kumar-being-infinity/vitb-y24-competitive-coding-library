class BitManipulation {
public:
    static long long getBit(long long n, int k) {
        return (n >> k) & 1LL;
    }

    static long long setBit(long long n, int k) {
        return n | (1LL << k);
    }

    static long long clearBit(long long n, int k) {
        return n & ~(1LL << k);
    }

    static long long toggleBit(long long n, int k) {
        return n ^ (1LL << k);
    }

    static bool isPowerOfTwo(long long n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    static int countSetBits(long long n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
};