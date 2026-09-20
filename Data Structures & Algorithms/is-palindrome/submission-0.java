class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int s1Length = (s1.length() / 2) + s1.length()%2;
        for (int i = 0; i < s1Length; i++) {
            if(s1.charAt(i) != s1.charAt(s1.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
