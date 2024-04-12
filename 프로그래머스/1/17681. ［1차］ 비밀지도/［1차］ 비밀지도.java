class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            String binaryValueA = binaryConvertor(n, arr1[i]);
            String binaryValueB = binaryConvertor(n, arr2[i]);
            String binaryValueResult = compareIndexValue(binaryValueA, binaryValueB);

            result[i] = binaryValueResult;
        }

        result = resultConvertor(result);

        return result;
    }

    private String binaryConvertor(int n, int value) {
        StringBuilder binaryString = new StringBuilder(Integer.toBinaryString(value));
        int checkedLen = n - binaryString.length();

        while (checkedLen != 0) {
            binaryString.insert(0, "0");
            checkedLen -= 1;
        }

        return binaryString.toString();
    }

    private String compareIndexValue(String value1, String value2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < value1.length(); i++) {
            char a = value1.charAt(i);
            char b = value2.charAt(i);

            if (a == b) {
                result.append(a);
                continue;
            }

            result.append("1");
        }
        return result.toString();
    }

    private String[] resultConvertor(String[] values) {
        String[] result = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            String replace = values[i].replace("1", "#");
            String replace1 = replace.replace("0", " ");
            result[i] = replace1;
        }

        return result;
    }
}