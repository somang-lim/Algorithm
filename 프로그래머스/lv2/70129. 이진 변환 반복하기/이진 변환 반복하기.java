class Solution {
    public int[] solution(String s) {
        // answer[0] = 이진 변환 횟수
        // answer[1] = 변환 과정에서 제거된 모든 0의 개수
        int[] answer = new int[2];
        
        // s가 1이 될 때까지 반복
        while (s.length() > 1) {
            int countOne = 0;
            
            for (int i = 0; i < s.length(); i++) {
                // 0인 경우, answer[1]에 추가
                if (s.charAt(i) == '0') answer[1]++;
                
                // 1인 경우, 1만 포함된 s의 길이 추가
                else countOne++;
            }
            
            s = Integer.toBinaryString(countOne);
            
            // 이진 변환 횟수 추가
            answer[0]++;
        }
        
        return answer;
    }
}