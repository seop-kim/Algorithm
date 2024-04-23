import java.util.*;

class Solution {
    public String[] solution(String[][] tickets) {
        int cnt = 0;
        boolean[] visit = new boolean[tickets.length];
        List<String> allPath = new ArrayList<>();
        dfs("ICN", "ICN", tickets, cnt, allPath, visit);
        Collections.sort(allPath);
        return allPath.get(0).split(" ");
    }

    public void dfs(String start, String path, String[][] tickets, int cnt, List<String> allPath, boolean[] visit) {
        if (cnt == tickets.length) {
            allPath.add(path);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (start.equals(tickets[i][0]) && !visit[i]) {
                visit[i] = true;
                dfs(tickets[i][1], path + " " + tickets[i][1], tickets, cnt + 1, allPath, visit);
                visit[i] = false;
            }
        }
    }
}