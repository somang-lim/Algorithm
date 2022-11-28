import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        /*
         * 누적된 값이 최소가 되기 위해서는
         * A 배열의 최소와 B 배열의 최대를 곱한 값을 더해야 한다.
         */
        
        // 배열 정렬
        Arrays.sort(A);
        Arrays.sort(B);        
        
        // A 배열과 B 배열 곱한 값을 누적한다.
        int last = A.length;
        for (int i = 0; i < last; i++) {
            answer += A[i] * B[last - 1 - i];
        }

        return answer;
    }
}