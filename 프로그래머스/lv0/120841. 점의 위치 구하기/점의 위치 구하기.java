class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        char dot1 = (dot[0] > 0) ? '+' : '-';
        char dot2 = (dot[1] > 0) ? '+' : '-';
        
        if (dot1 == '+' && dot2 == '+') answer = 1;
        
        if (dot1 == '-' && dot2 == '+') answer = 2;
        
        if (dot1 == '-' && dot2 == '-') answer = 3;
        
        if (dot1 == '+' && dot2 == '-') answer = 4;
        
        return answer;
    }
}