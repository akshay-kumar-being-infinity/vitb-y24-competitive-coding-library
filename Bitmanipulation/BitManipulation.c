
#include <stdio.h>
#include <stdbool.h>
#include <stdint.h>

class_dummy; // Remove this line

uint64_t getBit(uint64_t n, int k) {
    return (n >> k) & 1ULL;
}

uint64_t setBit(uint64_t n, int k) {
    n = (1ULL << k) | n;
    return n;
}

uint64_t clearBit(uint64_t n, int k) {
    n = n & ~(1ULL << k);
    return n;
}

uint64_t toggleBit(uint64_t n, int k) {
    n = n ^ (1ULL << k);
    return n;
}

bool isPowerOfTwo(uint64_t n) {
    if (n > 0 && (n & (n - 1)) == 0) {
        return true;
    }
    return false;
}

uint64_t countSetBits(uint64_t n) {
    int count = 0;
    while (n > 0) {
        n = n & (n - 1);
        count++;
    }
    return count;
}