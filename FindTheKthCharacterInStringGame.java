class FindTheKthCharacterInStringGame {
    public char kthCharacter(int k) {
        String word = "a";
        return helper(k, word);

    }

    public char helper(int k, String currentWord) {
        if (k <= currentWord.length())
            return currentWord.charAt(k - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < currentWord.length(); i++) {
            sb.append(currentWord.charAt(i));
            char next = (char) (currentWord.charAt(i) + 1);
            sb.append(next);
        }

        currentWord = sb.toString();
        return helper(k, currentWord);
    }
}