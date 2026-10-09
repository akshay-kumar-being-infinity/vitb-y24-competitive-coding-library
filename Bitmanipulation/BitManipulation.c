
#include <stdio.h>
#include <stdbool.h>

long long getBit(long long n, int k) {
    return (n >> k) & 1LL;
}

long long setBit(long long n, int k) {
    n = (1LL << k) | n;
    return n;
}

long long clearBit(long long n, int k) {
    n = n & ~(1LL << k);
    return n;
}

long long toggleBit(long long n, int k) {
    n = n ^ (1LL << k);
    return n;
}

bool isPowerOfTwo(long long n) {
    if (n > 0 && (n & (n - 1)) == 0) {
        return true;
    }
    return false;
}

long long countSetBits(long long n) {
    long long count = 0;

    while (n > 0) {
        n = n & (n - 1);
        count++;
    }

    return count;
}

