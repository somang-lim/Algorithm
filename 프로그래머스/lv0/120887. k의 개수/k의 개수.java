class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String findNumber = String.valueOf(k);
        for (int num = i; num <= j; num++) {
            String contain = String.valueOf(num);
            
            if (contain.contains(findNumber)) {
                String[] array = contain.split("");
                for (String s : array) {
                    if (s.equals(findNumber)) answer++;
                }
            }
        }
        
        return answer;
    }
}