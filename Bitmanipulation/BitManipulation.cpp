
#include <iostream>
using namespace std;

class BitManipulation {
public:

    static long long getBit(long long n, int k) {
        return (n >> k) & 1LL;
    }

    static long long setBit(long long n, int k) {
        n = (1LL << k) | n;
        return n;
    }

    static long long clearBit(long long n, int k) {
        n = n & ~(1LL << k);
        return n;
    }

    static long long toggleBit(long long n, int k) {
        n = n ^ (1LL << k);
        return n;
    }

    static bool isPowerOfTwo(long long n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    static long long countSetBits(long long n) {
        long long count = 0;

        while (n > 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }
};
