class Power
{
    public static boolean isPowerOfTwo(long n) 
    {
        return n>0&&(n&(n-1))==0;
    }
}