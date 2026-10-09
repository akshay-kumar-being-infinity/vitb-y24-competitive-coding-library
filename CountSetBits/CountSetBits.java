public static int countSetBits(long n) {
        int count = 0;
    while (n > 0) {
        count += (n & 1); 
        n >>>= 1;         
    }
    return count;
    // return the number of bits set to 1 in n (n >= 0)
}