import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                list.add(array[i]);
            }
        }
        
        if (list.isEmpty()) {
            return 0;
        }
        
        answer = list.size();
        
        return answer;
    }
}