public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ch) {
                sb.append(word.charAt(i));
            } else {
                sb.append(word.charAt(i));
                String revStr = sb.reverse().toString();
                return revStr + word.substring(i + 1);
            }
        }
        return word;
    }
}
