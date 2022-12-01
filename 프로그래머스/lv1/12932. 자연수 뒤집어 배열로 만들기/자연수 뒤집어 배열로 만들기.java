class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        
        int[] answer = new int[s.length()];
        
        int num = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            answer[i] = s.charAt(num) - '0';
            
            num--;
        }
        
        return answer;
    }
}