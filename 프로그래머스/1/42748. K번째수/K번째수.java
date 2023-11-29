import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> resultArray = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            List<Integer> temporaryArray = new ArrayList<>();
            int startPoint = commands[i][0] - 1;
            int endPoint = commands[i][1] - 1;

            for (int j = startPoint; j <= endPoint; j++) {
                temporaryArray.add(array[j]);
            }

            Collections.sort(temporaryArray);
            resultArray.add(temporaryArray.get(commands[i][2] - 1));
        }
        int[] answer = resultArray.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}