class Solution {
    public String solution(String s) {
        String answer = "";
        int point = s.length() / 2;
        if(s.length() % 2 == 0){
            answer += s.charAt(point - 1) + "" + s.charAt(point);
            return answer;
        }
        
        answer += s.charAt(point);
        return answer;
    }
}