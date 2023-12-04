class Solution {
    public int solution(int n, String control) {
                int answer = n;

        char[] charArray = control.toCharArray();

        for (char c : charArray) {
            if (c == 'w') {
                answer += 1;
            }
            if (c == 's') {
                answer -= 1;
            }
            if (c == 'd') {
                answer += 10;
            }
            if (c == 'a') {
                answer -= 10;
            }
        }
        return answer;
    }
}