import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        int longest = sides[2];
        int last = sides[0] + sides[1];
        
        answer = (last > longest) ? 1 : 2;
        
        return answer;
    }
}