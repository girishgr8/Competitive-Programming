class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        int countSetBits = 0;
        while(n>0){
            if((n&1)==1) countSetBits++;
            n = n>>1; 
        }
        if(countSetBits==1) return true;
        else return false;
    }
}