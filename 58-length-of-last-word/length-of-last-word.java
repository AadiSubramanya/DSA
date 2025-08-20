class Solution {
    public int lengthOfLastWord(String s) {
        int c = 0;
        for (int i = s.length()-1; i>=0; i--){
            if (s.charAt(i) != ' '){
                c++;
            }
            if (s.charAt(i) == ' ' && c > 0){
                break;
            }
        }
        return c;
    }
}