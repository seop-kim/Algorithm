class Solution {
  private static final int VALUE = 1_000_000_007;
    
  public int solution(int m, int n, int[][] puddles) {
        int[][] road = new int[n][m];
        road[0][0] = 1;

        for (int i = 0; i < puddles.length; i++) {
            road[puddles[i][1] - 1][puddles[i][0] - 1] = -1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                setRoadValue(road, i, j);
            }
        }

        return road[n - 1][m - 1] % VALUE;
    }

    private void setRoadValue(int[][] road, int i, int j) {
        if (road[i][j] == -1) {
            road[i][j] = 0;
            return;
        }

        if (i != 0) {
            road[i][j] += road[i - 1][j] % VALUE;
        }

        if (j != 0) {
            road[i][j] += road[i][j - 1] % VALUE;
        }
    }
}