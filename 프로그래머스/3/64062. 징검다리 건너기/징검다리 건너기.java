class Solution {
    public int solution(int[] stones, int k) {
        int result = 0;
        int left = 0;
        int right = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (crossCheck(stones, k, mid)) {
                left = mid + 1;
                result = mid;
                
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
    
    public boolean crossCheck(int[] stones, int k, int mid) {
        int step = 0;
        for (int stone : stones) {
            if (step >= k) {
                continue;
            }

            if (stone < mid) {
                step++;
                continue;
            }

            step = 0;
        }
        return step < k;
    }
}