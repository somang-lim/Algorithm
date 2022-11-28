import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 1. 문자열을 배열로 바꾼다.
        String[] strArr = s.split(" ");
        
        // 2. 문자 배열을 숫자 배열로 바꾼다.
        int[] intArr = Arrays
            .stream(strArr)
            .mapToInt(Integer::parseInt)
            .toArray();
        
        // 배열 정렬
        Arrays.sort(intArr);
        
        // 3. 숫자 배열에서 최소·최대값을 찾는다.
        answer = intArr[0] + " " + intArr[intArr.length - 1];
        
        return answer;
    }
}