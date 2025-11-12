package com.AlgoExpert.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class tournamentWinner {

    public String tournamentWinner2(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
    ) {
        // Write your code here.
        HashMap<String, Integer> winnerMap = new HashMap<String, Integer>();
        HashSet<String> teams = new HashSet<String>();
        for (int i = 0; i < competitions.size(); i++) {
            String home = competitions.get(i).get(0);
            String away = competitions.get(i).get(1);
            winnerMap.put(home, 0);
            winnerMap.put(away, 0);
            teams.add(home);
            teams.add(away);


        }

        for (int i = 0; i < results.size(); i++) {
            if (results.get(i) == 1) {
                String homeTeam = competitions.get(i).get(0);
                winnerMap.put(homeTeam, winnerMap.get(homeTeam) + 3);

            } else {
                String awayTeam = competitions.get(i).get(1);
                winnerMap.put(awayTeam, winnerMap.get(awayTeam) + 3);

            }


        }
        String winningTeam = "";
        int bestScore = 0;

        for (String team : teams) {
            if (winnerMap.get(team) > bestScore) {
                winningTeam = team;
                bestScore = winnerMap.get(team);
            }

        }


        return winningTeam;
    }
}
