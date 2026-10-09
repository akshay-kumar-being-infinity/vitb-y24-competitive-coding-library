class BitManipulation {
    // public static void main(String[] args){
    //     long n=15;
    //     int k=3;
    //     System.out.println(BitManipulation.getBit(n,k));
    //     System.out.println(BitManipulation.setBit(n,k));
    //     System.out.println(BitManipulation.clearBit(n,k));
    //     System.out.println(BitManipulation.toggleBit(n,k));
    // }
    public static long getBit(long n, int k) {
        // return 1 if the k-th bit of n is set, otherwise 0
        return (n&(1L<<k))==0?0:1;
    }

    public static long setBit(long n, int k) {
        // set the k-th bit to 1
        n=n|(1L<<k);
        return n;
    }

    public static long clearBit(long n, int k) {
        // set the k-th bit to 0
        n=n&(~(1L<<k));
        return n;
    }

    public static long toggleBit(long n, int k) {
        // flip the k-th bit
        n=n^(1L<<k);
        return n;
    }
}

