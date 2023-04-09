class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            char at = my_string.charAt(i);
            if ('1' <= at && at <= '9') {
                answer += at - 48;
            }
        }
        
        return answer;
    }
}