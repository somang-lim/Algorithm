class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String num = String.valueOf(order);
        
        long count3 = num.chars().filter(c -> c == '3').count();
        long count6 = num.chars().filter(c -> c == '6').count();
        long count9 = num.chars().filter(c -> c == '9').count();

        answer = (int) (count3 + count6 + count9);
        
        return answer;
    }
}