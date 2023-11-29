class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int check = 0;
        for (int i = 0; i < s.length(); i++) {
            if (check <= -1) {
                answer = false;
                break;
            }

            if (s.charAt(i) == '(') {
                check++;
                continue;
            }

            if (s.charAt(i) == ')') {
                check--;
            }
        }

        if (check != 0) {
            answer = false;
        }

        return answer;
    }
}