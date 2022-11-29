import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stack = new Stack();
        
        for (int i = 0; i < s.length(); i++) {
            // 여는 괄호가 나왔을 경우, stack의 가장 윗부분에 요소를 추가한다.
            if (s.charAt(i) == '(') {
                stack.push('(');
            }
            
            if (s.charAt(i) == ')') {
                // 닫는 괄호가 먼저 나온 경우, 올바른 괄호일 수 없다.
                if (stack.isEmpty()) {
                    return false;
                }
                
                // stack이 비어있지 않다면, stack의 가장 위에 있는 요소를 제거한다.
                stack.pop();
            }
        }
        
        answer = (stack.isEmpty()) ? true : false;

        return answer;
    }
}