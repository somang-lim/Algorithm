import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int size = numbers.length - 1;
        
        answer = numbers[size] * numbers[size-1];
        
        return answer;
    }
}