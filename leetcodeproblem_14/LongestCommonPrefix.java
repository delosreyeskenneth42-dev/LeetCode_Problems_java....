package leetcodeproblem_14;

class Solution {
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0)
            return "";

        String word = "";
        int increase = 0;
        while (true) {
            if (increase >= strs[0].length()) {
                return word;
            }
            char current = strs[0].charAt(increase);

            for (int i = 0; i < strs.length; i++) {
                if (increase >= strs[i].length() || strs[i].charAt(increase) != current) {
                    return word;
                }
            }
            word += current;
            increase++;
        }
    }

    public static void main(String[] args) {
        String[] strs = { "ans", "ana", "ane", "anw" };

        System.out.println(longestCommonPrefix(strs));
    }
}