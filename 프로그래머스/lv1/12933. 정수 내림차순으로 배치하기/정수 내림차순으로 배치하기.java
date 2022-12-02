import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] arr = String.valueOf(n).split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        String str = "";
        
        for (String s : arr) {
            str += s;
        }
        
        answer = Long.parseLong(str);
        
        return answer;
    }
}