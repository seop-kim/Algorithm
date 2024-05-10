class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = k + "";
        for(i = i; i <= j; i++){
            String iStr = i + "";
            
            for(char c : iStr.toCharArray()){
                if(String.valueOf(c).equals(kStr)){
                    System.out.println("good");
                    answer++;
                }    
            }
        }
        return answer;
    }
}