class Solution {
    public boolean solution(String s) {
        int size = s.length();
        
        if (size != 4 && size != 6) {
            return false;
        }
        
        for (int i = 0; i < size; i++) {
            if (!('0' <= s.charAt(i) && s.charAt(i) <= '9')) {
                return false;
            }
        }
        
        return true;
    }
}