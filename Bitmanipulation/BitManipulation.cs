class BitManipulation
{
    public static long GetBit(long n, int k)
    {
        return (n >> k) & 1L;
    }

    public static long SetBit(long n, int k)
    {
        return n | (1L << k);
    }

    public static long ClearBit(long n, int k)
    {
        return n & ~(1L << k);
    }

    public static long ToggleBit(long n, int k)
    {
        return n ^ (1L << k);
    }

    public static bool IsPowerOfTwo(long n)
    {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static int CountSetBits(long n)
    {
        int count = 0;

        while (n > 0)
        {
            n = n & (n - 1);
            count++;
        }

        return count;
    }
}