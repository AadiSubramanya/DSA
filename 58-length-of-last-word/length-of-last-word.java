class Solution {
    public int lengthOfLastWord(String s) {
        int c = 0, flag = 0;
        for (int i = s.length()-1; i>=0; i--){
            if (s.charAt(i) != ' '){
                c++;
                if (flag != 1){
                    flag = 1;
                }
            }
            if (s.charAt(i) == ' ' && flag == 1){
                break;
            }
        }
        return c;
    }
}