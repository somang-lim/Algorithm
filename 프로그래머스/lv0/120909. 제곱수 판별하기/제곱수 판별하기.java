import java.lang.Math;

class Solution {
    public int solution(int n) {
        int answer = 2;

        Double n_sqrt = Math.sqrt(n);
        
        if (n_sqrt == n_sqrt.intValue())  {
            answer = 1;
        }
        
        return answer;
    }
}