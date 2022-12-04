import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            
            return arr;
        }
        
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        Integer min = Collections.min(list);
        list.remove(min);

        int[] answer = new int[arr.length - 1];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}