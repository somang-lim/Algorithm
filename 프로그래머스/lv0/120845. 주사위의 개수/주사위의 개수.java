class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int x = box[0] / n;
        int y = box[1] / n;
        int z = box[2] / n;
        
        answer = x * y * z;
        
        return answer;
    }
}