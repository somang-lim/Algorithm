import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        // list에 중복을 제거하고 담는다.
        for (int i = 0; i < arr.length; i++) {
            // 첫 번째는 무조건 담는다.
            if (i == 0) {
                list.add(arr[i]);
                continue;
            }
            
            // 이전 숫자와 현재 숫자가 다르면, 숫자를 담는다.
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        
        // 중복이 제거된 크기 만큼 배열을 만든다.
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}