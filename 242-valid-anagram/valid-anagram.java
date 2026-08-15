class Solution {
    public boolean isAnagram(String s, String t) {
        // Fast fail for different lengths
        if (s.length() != t.length()) return false;
        
        int[] charCounts = new int[26];
        
        // Convert to arrays to avoid charAt() method overhead
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        // Single loop, direct array access
        for (int i = 0; i < sChars.length; i++) {
            charCounts[sChars[i] - 'a']++;
            charCounts[tChars[i] - 'a']--;
        }
        
        // Check for any non-zero values
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}