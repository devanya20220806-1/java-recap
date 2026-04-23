package com.dev.basic;

public class LongestSubStringWORepeatingChar {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }

    private static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxLength = 0; // Initialize maximum length to 0
        int left = 0; // Left pointer of the sliding window
        int right = 0; // Right pointer of the sliding window
        java.util.Set<Character> charSet = new java.util.HashSet<>(); // Set to store unique characters

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (!charSet.contains(currentChar)) {
                charSet.add(currentChar); // Add current character to the set
                maxLength = Math.max(maxLength, right - left + 1); // Update max length if current window is larger
                right++; // Move right pointer to expand the window
            } else {
                charSet.remove(s.charAt(left)); // Remove character at left pointer from the set
                left++; // Move left pointer to shrink the window
            }
        }

        return maxLength;
    }
}
