import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copy = Arrays.copyOf(emergency, emergency.length);
        
        Arrays.sort(copy);
        
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < copy.length; j++) {
                if (emergency[i] == copy[j]) {
                    answer[i] = emergency.length - j;
                }
            }
        }
        
        return answer;
    }
}