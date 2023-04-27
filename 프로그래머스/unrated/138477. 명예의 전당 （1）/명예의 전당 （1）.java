import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> temp = new ArrayList<>();
        
        int size = score.length;
        for (int i = 0; i < size; i++) {
            if (temp.size() < k) {
                temp.add(score[i]);
                Collections.sort(temp);
                answer[i] = temp.get(0);
                continue;
            }
            
            if (temp.size() == k) {
                int minimum = temp.get(0);
                
                if (minimum < score[i]) {
                    temp.remove(0);
                    temp.add(score[i]);
                    Collections.sort(temp);
                }
                
                answer[i] = temp.get(0);
            }
        }
        
        return answer;
    }
}