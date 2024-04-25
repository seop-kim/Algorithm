class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int pCount = 0;
        int yCount = 0;
        String a = s.toLowerCase();
        char[] aArr = a.toCharArray();
        
        for(int i = 0; i < aArr.length; i++){
            if(aArr[i] == 'p'){
                pCount++;
            }
            
            if(aArr[i] == 'y'){
                yCount++;
            }
        }
        
        if(pCount == yCount){
            answer = true;
        }

        return answer;
    }
}