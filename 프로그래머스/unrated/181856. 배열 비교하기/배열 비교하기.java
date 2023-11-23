class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length || (arr1.length == arr2.length && arrSub(arr1) > arrSub(arr2))) {
            return 1;
        }

        if (arr1.length < arr2.length || (arr1.length == arr2.length &&arrSub(arr1) < arrSub(arr2))) {
            return -1;
        }

        return 0;
    }
    
    public int arrSub(int[] arr) {
        int result = 0;

        for (int value : arr) {
            result += value;
        }

        return result;
    }
}