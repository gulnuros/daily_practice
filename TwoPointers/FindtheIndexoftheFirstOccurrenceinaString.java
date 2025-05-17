package TwoPointers;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {
        int i = 0, j = 0;
        int start = 0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == needle.length()) {
                    return i - j;
                }
            } else {
                start++;
                i = start;
                j = 0;
            }

        }
        return -1;
    }
}

// Find the Index of the First Occurrence in a String