class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = age + "";
        
        for(int i = 0; i < ageStr.length(); i++){
            answer += (char) (97 + Integer.parseInt(String.valueOf(ageStr.charAt(i))));
        }
        
        return answer;
    }
}