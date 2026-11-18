class Solution {
    public int maxVowels(String s, int k) {
        int vowelCount = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }
        }

        int maxVowels = vowelCount;

        // Slide the window
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                vowelCount--;
            }

            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }

            if (vowelCount > maxVowels) {
                maxVowels = vowelCount;
            }
        }

        return maxVowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }
}