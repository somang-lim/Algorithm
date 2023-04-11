import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        
        String[] my_strings = my_string.split("");
        
        Arrays.sort(my_strings);
        
        for (String s : my_strings) {
            answer += s;
        }
        
        return answer;
    }
}