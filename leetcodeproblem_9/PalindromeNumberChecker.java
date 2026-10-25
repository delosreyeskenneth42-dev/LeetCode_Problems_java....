package leetcodeproblem_9;

import java.util.Scanner;

class PalindromeNumberChecker {
    public static boolean isPalindrome(int x) {

        String str = String.valueOf(x);

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int x = input.nextInt();

        System.out.println(isPalindrome(x));

        input.close();
    }
}
