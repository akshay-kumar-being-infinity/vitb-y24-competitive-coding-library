#include <stdbool.h>

long long getBit(long long n, int k) {
    return (n >> k) & 1LL;
}

long long setBit(long long n, int k) {
    return n | (1LL << k);
}

long long clearBit(long long n, int k) {
    return n & ~(1LL << k);
}

long long toggleBit(long long n, int k) {
    return n ^ (1LL << k);
}

bool isPowerOfTwo(long long n) {
    return n > 0 && (n & (n - 1)) == 0;
}

int countSetBits(long long n) {
    int count = 0;
    while (n > 0) {
        n = n & (n - 1);
        count++;
    }
    return count;
}