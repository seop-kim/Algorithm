class Solution {
    public String solution(String my_string) {
        String[] checkStr = {"a","e","i","o","u"};
        String answer = my_string;
        
        for(String str : checkStr){
            answer = answer.replace(str, "");
        }
        
        return answer;
    }
}