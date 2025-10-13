class Solution {
    public int addDigits(int num) {
        int LOL=0;
        while(num>=10)
        {
            LOL=0;
            while(num>0)
            {
                int temp= num%10;
                LOL+=temp;
                num/=10;
            }
            num=LOL;
        }
        return num;
    }
}