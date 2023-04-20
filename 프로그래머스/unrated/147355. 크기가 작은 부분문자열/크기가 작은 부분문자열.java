class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int p_size = p.length();
        long p_int = Long.parseLong(p);
        
        for (int i = 0; i <= t.length() - p_size; i++) {
            long t_substring_int = Long.parseLong(t.substring(i, i + p_size));
            
            if (t_substring_int <= p_int) answer++;
        }
        
        return answer;
    }
}