class Solution {
    public boolean isPowerOfTwo(int n) {
        // Base Case 1: Numbers less than or equal to 0 cannot be powers of two
        if (n <= 0) {
            return false;
        }
        
        // Base Case 2: 2^0 = 1, so 1 is always a power of two
        if (n == 1) {
            return true;
        }
        
        // Base Case 3: If it has a remainder when divided by 2, it's not a power of two
        if (n % 2 != 0) {
            return false;
        }
        
        // Induction Step: Recursively check the quotient
        return isPowerOfTwo(n / 2);
    }
}
