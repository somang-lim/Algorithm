class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] my_char = my_string.toCharArray();
        
        char num1Char = my_char[num1];
        char num2Char = my_char[num2];
        
        my_char[num1] = num2Char;
        my_char[num2] = num1Char;
        
        answer = String.valueOf(my_char);
        
        return answer;
    }
}