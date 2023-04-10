class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer =  new int[numbers.length];
        
        if (direction.equals("right")) {
            int count = answer.length - 1;
            for (int i = 0; i < answer.length; i++) {
                if (count == answer.length) count = 0;
                answer[i] = numbers[count];
                count++;
            }
        }
        
        if (direction.equals("left")) {
            int count = 1;
            for (int i = 0; i < answer.length; i++) {
                if (count == answer.length) count = 0;
                answer[i] = numbers[count];
                count++;
            }
        }
            
        return answer;
    }
}