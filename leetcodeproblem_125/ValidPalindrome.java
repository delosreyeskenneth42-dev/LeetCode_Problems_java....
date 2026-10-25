package leetcodeproblem_125;

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newWords = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {

                newWords.append(ch);
            }
        }
        String clean = newWords.toString();
        for (int i = 0; i < clean.length() / 2; i++) {
            if (clean.charAt(i) != clean.charAt(clean.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}