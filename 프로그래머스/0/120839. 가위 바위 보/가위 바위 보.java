class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] rspArr = rsp.split("");
        
        for(String rspValue : rspArr){
            if(rspValue.equals("2")){
                answer += "0";
                continue;
            }
            
            if(rspValue.equals("0")){
                answer += "5";
                continue;
            }
            
            if(rspValue.equals("5")){
                answer += "2";
                continue;
            }
        }
        
        return answer;
    }
}