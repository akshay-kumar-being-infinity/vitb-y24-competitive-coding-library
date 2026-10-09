package BitManipulation;

class BitManipulation {
    public static long getBit(long n, int k) {
        //get kth bit by doing logical AND
        return n&(1<<k);
    }
    
    public static long setBit(long n, int k) {
        
        return n|(1<<k);
        //get kth bit by doing logical OR
    }
    
    public static long clearBit(long n, int k) {
        
        return n&~(1<<k);
        //get kth bit by doing logical AND  and TILDA
    }
    
    public static long toggleBit(long n, int k) {
        
        return n^(1<<k);
        //get kth bit by doing logical XOR
    }
}
