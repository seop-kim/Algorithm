class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer stringBuffer = new StringBuffer(my_string);
        answer = stringBuffer.reverse().toString();
        return answer;
    }
}