class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        int rem, rev = 0;
        int original = x;

        while (x != 0) {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }

        return original == rev;
    }
}