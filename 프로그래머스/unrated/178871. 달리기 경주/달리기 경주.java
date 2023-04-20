import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }
        
        for (String player : callings) {
            int ownRank = rankMap.get(player);
            String aheadPlayer = players[ownRank - 1];
            
            players[ownRank] = aheadPlayer;
            players[ownRank - 1] = player;
            
            rankMap.put(player, ownRank - 1);
            rankMap.put(aheadPlayer, ownRank);
        }
        
        return players;
    }
}