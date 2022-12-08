class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String number = "";
        while (n != 0) {
            number += n % 3;
            n /= 3;
        }
        
        answer = Integer.parseInt(number, 3);
        
        return answer;
    }
}