package String;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int len = arr.length - 1;
        return arr[len].length();
    }
}

// optimized solution
// class Solution {
// public int lengthOfLastWord(String s) {
// int len =0;
// int i = s.length() - 1;
// while(i>=0 && s.charAt(i) == ' '){
// i --;
// }

// while(i>=0 && s.charAt(i) != ' '){
// len++;
// i--;
// }

// return len;
// }
// }