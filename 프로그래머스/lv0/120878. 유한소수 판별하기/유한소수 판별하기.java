import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int number = 0;
        
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                number = i;
            }
        }
        
        if (number != 0) {
            b /= number;
        }
        List<Integer> numberList = new ArrayList<>();
        
        for (int i = 2; i < 1000; i++) {
            if (b % i == 0) {
                numberList.add(i);
                b /= i;
                i--;
                if (b < 2) break;
            }
        }
        
        numberList.removeIf(value -> value == 2 || value == 5);
        
        if (numberList.size() == 0) return 1;
        
        return 2;
    }
}