class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 1. 문자열을 소문자로 변경한 후, 문자 배열로 변경한다.
        String[] strArr = s.toLowerCase().split("");
        
        // 이전 문자가 공백인지 확인하는 메서드
        boolean space = true;
        
        /*
         * 공백문자가 연속해서 나온다면, 반환 값도 공백문자가 여러 개 나와야 한다.
         * split(" ")으로 공백 단위를 자르게 되면 연속한 공백문자를 넣을 수 없다.
         */
        
        // repeat.
        for (String ss : strArr) {
            // space가 true면 대문자, 아니면 그대로 소문자
            answer += space ? ss.toUpperCase() : ss;
            
            // 공백이 오면 space를 true, 아니면 false
            space = ss.equals(" ") ? true : false;
        }
        
        return answer;
    }
}