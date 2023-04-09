import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        String count = "";
        for (int i = 0; i < my_string.length(); i++) {
            if ('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {
                count += (char) my_string.charAt(i);
            }
        }
        
        answer = new int[count.length()];
        
        if (answer.length == 1) return answer;
        
        for (int i = 0; i < count.length(); i++) {
            answer[i] = count.charAt(i) - 48;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}