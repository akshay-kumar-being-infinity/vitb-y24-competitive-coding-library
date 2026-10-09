public class Bitmanuplation {
    
    public static long getBit(long n, int k) {
        return (n&(1<<k))==0?0:1;
    }

    public static long setBit(long n, int k) {
        return (n|(1<<k));
    }

    public static long clearBit(long n, int k) {
        return n&~(1<<k);
    }

    public static long toggleBit(long n, int k) {
        // flip the k-th bit
        return n^(1<<k);
    }
}

