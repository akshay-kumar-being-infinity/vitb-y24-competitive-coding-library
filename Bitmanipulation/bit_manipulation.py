class BitManipulation:

    @staticmethod
    def get_bit(n, k):
        return (n >> k) & 1

    @staticmethod
    def set_bit(n, k):
        return n | (1 << k)

    @staticmethod
    def clear_bit(n, k):
        return n & ~(1 << k)

    @staticmethod
    def toggle_bit(n, k):
        return n ^ (1 << k)

    @staticmethod
    def is_power_of_two(n):
        return n > 0 and (n & (n - 1)) == 0

    @staticmethod
    def count_set_bits(n):
        count = 0
        while n > 0:
            n = n & (n - 1)
            count += 1
        return count