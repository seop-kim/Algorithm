class Solution {
    public boolean solution(String s) {
        if(!(4 == s.length() || s.length() == 6)){
            return false;
        }
        
        for(int i = 0; i < s.length(); i++){
            try{
                Integer.parseInt(s);   
            }catch(Exception e){
                return false;
            }
        }
        
        return true;
    }
}