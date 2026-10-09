class CountSetBits {
    public static void main(String[] args) {
        long n = 15; // Example number
        System.out.println("Number of set bits in " + n + " is: " + countSetBits(n));
    }

    public static int countSetBits(long n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}