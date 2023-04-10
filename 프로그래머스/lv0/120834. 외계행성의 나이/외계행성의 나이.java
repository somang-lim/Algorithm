class Solution {
    public String solution(int age) {
        String answer = "";
        
        String[] num = String.valueOf(age).split("");
        
        for (int i = 0; i < num.length; i++) {
            answer += String.valueOf((char) (Integer.parseInt(num[i]) + 97));
        }
        
        return answer;
    }
}