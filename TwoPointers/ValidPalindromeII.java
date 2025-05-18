package TwoPointers;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return (isPalindrome(s, l, r - 1)) || (isPalindrome(s, l + 1, r));
            }
        }
        return true;
    }

    public boolean isPalindrome(String str, int l, int r) {

        while (l < r) {
            if (str.charAt(l) == str.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
