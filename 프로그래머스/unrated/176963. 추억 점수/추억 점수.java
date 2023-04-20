import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        // 1. 이름과 그리움 점수가 일치하도록 map에 담는다.
        Map<String, Integer> people = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            people.put(name[i], yearning[i]);
        }
        
        // 2. 사진에 찍힌 인물의 이름을 보고 그리움 점수를 찾아서 더한다.
        for (int i = 0; i < photo.length; i++) {
            int point = 0;
            
            for (int j = 0; j < photo[i].length; j++) {
                if (people.get(photo[i][j]) == null) {
                    continue;
                }
                
                int get = people.get(photo[i][j]);
                point += get;
            }
            
            answer[i] = point;
        }
        
        return answer;
    }
}