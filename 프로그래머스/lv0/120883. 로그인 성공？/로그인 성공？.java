class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for (int i = 0; i < db.length; i++) {
            boolean idCheck = id_pw[0].equals(db[i][0]);
            boolean pwCheck = id_pw[1].equals(db[i][1]);
            
            if (idCheck && pwCheck) {
                answer = "login";
                break;
            }
            else if (idCheck && !pwCheck) {
                answer = "wrong pw";
                break;
            }
            else {
                answer = "fail";
            }
        }
        
        return answer;
    }
}