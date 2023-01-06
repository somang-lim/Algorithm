class Solution {
    public int solution(int price) {
        if (price >= 500_000) {
            price *= 0.8;
            
            return price;
        }
        
        if (price >= 300_000) {
            price *= 0.9;
            
            return price;
        }
        
        if (price >= 100_000) {
            price *= 0.95;
            
            return price;
        }
        
        return price;
    }
}