class Solution {
    public boolean isPalindrome(String s) {
        String sNew = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int n = sNew.length();
        for (int i = 0; i < n / 2; i++) {
            if (sNew.charAt(i) != sNew.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
