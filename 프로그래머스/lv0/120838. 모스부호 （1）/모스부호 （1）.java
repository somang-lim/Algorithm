class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] alphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] letters = letter.split(" ");
        
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < 26; j++) {
                if (alphabet[j].equals(letters[i])) {
                    char alp = (char) (j + 97);
                    answer += String.valueOf(alp);
                }
            }
        }
        
        return answer;
    }
}