import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        String[] befores = before.split("");
        String[] afters = after.split("");
        
        Arrays.sort(befores);
        Arrays.sort(afters);
        
        before = Arrays.toString(befores);
        after = Arrays.toString(afters);
        
        if (before.equals(after)) answer = 1;
        
        return answer;
    }
}