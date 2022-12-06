class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long totalPrice = 0;
        
        for (int cnt = 1; cnt <= count; cnt++) {
            totalPrice += (price * cnt);
        }
        
        answer = money - totalPrice;
        
        if (answer < 0) {
            answer *= -1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}