class Solution {
    public int solution(int a, int b, boolean flag) {
        if(flag){
            return a + b;
        }
        int answer = a -b;
        return answer;
    }
}