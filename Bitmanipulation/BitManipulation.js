
class BitManipulation {

    static getBit(n, k) {
        return (n >> BigInt(k)) & 1n;
    }

    static setBit(n, k) {
        n = (1n << BigInt(k)) | n;
        return n;
    }

    static clearBit(n, k) {
        n = n & ~(1n << BigInt(k));
        return n;
    }

    static toggleBit(n, k) {
        n = n ^ (1n << BigInt(k));
        return n;
    }

    static isPowerOfTwo(n) {
        if (n > 0n && (n & (n - 1n)) === 0n) {
            return true;
        }
        return false;
    }

    static countSetBits(n) {
        let count = 0;

        while (n > 0n) {
            n = n & (n - 1n);
            count++;
        }

        return count;
    }
}
