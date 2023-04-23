class Solution {
    public String solution(int[] food) {
        String left = "";
        String answer = "";
        
        for (int i = 1; i < food.length; i++) {
            if (food[i] / 2 >= 1) {
                for (int j = 0; j < food[i] / 2; j++) {
                    left += i;
                }
            }
        }
        
        answer = left;
        
        StringBuffer sb = new StringBuffer(left);
        answer = answer + "0" + sb.reverse().toString();
        
        return answer;
    }
}