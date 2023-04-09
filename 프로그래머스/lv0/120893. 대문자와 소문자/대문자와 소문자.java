class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if ('a' <= a && a <= 'z') {
                answer += (char) (a - 32);
            }
            else if ('A' <= a && a <= 'Z') {
                answer += (char) (a + 32);
            }
        }
        
        return answer;
    }
}