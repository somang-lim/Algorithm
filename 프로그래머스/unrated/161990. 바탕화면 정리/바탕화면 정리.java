class Solution {
    public int[] solution(String[] wallpaper) {
        int xMin = wallpaper[0].length(), xMax = 0;
        int yMin = wallpaper.length, yMax = 0;
        
        for (int i = 0; i < wallpaper.length; i++) {
            int firstLoc = wallpaper[i].indexOf("#");
            int lastLoc = wallpaper[i].lastIndexOf("#");
            
            if (firstLoc >= 0) {
                if (firstLoc < xMin) xMin = firstLoc;
                if (lastLoc > xMax) xMax = lastLoc;
                
                if (i < yMin) yMin = i;
                if (i > yMax) yMax = i;
            }
        }
        
        int[] answer = {yMin, xMin, ++yMax, ++xMax};
        
        return answer;
    }
}