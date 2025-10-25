class Solution{
    public int[] countBits(int num) {
        int[] lol = new int[num+1];
        for (int i=1; i<=num; i++) lol[i] = lol[i>>1]+(i&1);
        return lol;
    }
}