#include <stdbool.h>

unsigned long long getBit(unsigned long long n, int k) {
    return (n >> k) & 1ULL;
}

unsigned long long setBit(unsigned long long n, int k) {
    return n | (1ULL << k);
}

unsigned long long clearBit(unsigned long long n, int k) {
    return n & ~(1ULL << k);
}

unsigned long long toggleBit(unsigned long long n, int k) {
    return n ^ (1ULL << k);
}

bool isPowerOfTwo(unsigned long long n) {
    return n > 0 && (n & (n - 1)) == 0;
}

int countSetBits(unsigned long long n) {
    int count = 0;

    while (n > 0) {
        n = n & (n - 1);
        count++;
    }

    return count;
}