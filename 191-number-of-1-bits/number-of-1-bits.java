class Solution {
    public int hammingWeight(int n) {
        int bits=0;
        while(n>0){
            if((n&1)!=0)bits++;
            n=n>>1;
        }
        return bits;
    }
}