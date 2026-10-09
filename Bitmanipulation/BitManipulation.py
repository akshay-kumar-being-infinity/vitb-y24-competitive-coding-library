
class BitManipulation:

    @staticmethod
    def getBit(n, k):
        return (n >> k) & 1

    @staticmethod
    def setBit(n, k):
        n = (1 << k) | n
        return n

    @staticmethod
    def clearBit(n, k):
        n = n & ~(1 << k)
        return n

    @staticmethod
    def toggleBit(n, k):
        n = n ^ (1 << k)
        return n

    @staticmethod
    def isPowerOfTwo(n):
        if n > 0 and (n & (n - 1)) == 0:
            return True
        return False

    @staticmethod
    def countSetBits(n):
        count = 0
        while n > 0:
            n = n & (n - 1)
            count += 1
        return count

