class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                continue;
            }
            answer += String.valueOf(a);
        }
        
        return answer;
    }
}