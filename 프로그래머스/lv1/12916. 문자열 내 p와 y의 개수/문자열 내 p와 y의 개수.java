class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        
        int countP = 0;
        int countY = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') countP++;
            
            if (s.charAt(i) == 'y') countY++;
        }

        return countP == countY ? true : false;
    }
}