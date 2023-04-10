class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        int size = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                size++;
            }
        }
        
        answer = new int[size];
        int num = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[num] = numlist[i];
                num++;
            }
        }
        
        return answer;
    }
}