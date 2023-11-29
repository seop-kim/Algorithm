class Solution {
    public String solution(String n_str) {
        int index = 0;
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) != '0') {
                index = i;
                break;
            }

            index = -1;
        }

        if (index == -1) {
            return "";
        }

        return n_str.substring(index);
    }
}