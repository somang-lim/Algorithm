class Solution {
    public int solution(int n) {
        // 자연수 n은 자기 자신을 포함한다. (ex. 15 = 15)
        int answer = 1;

        for (int i = 1; i <= n; i++) {
            int sum = i;
            
            for (int j = i+1; j <= n; j++) {
                sum += j;
                
                // 더한 값이 n과 같다면, 표현 방법++;
                if (sum == n) {
                    answer++;
                    break;
                }
                
                // 더한 값이 n보다 크면, 다음 단계로 넘어간다.
                if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
}