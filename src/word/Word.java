package word;

public class Word {

    private String word;
    private boolean[] guessedLetters;

    public Word(String word) {
        this.word = word;

        this.guessedLetters = new boolean[this.word.length()];
    }

    public String getWord() {

        String s = "";

        char[] chars = this.word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (guessedLetters[i]) {
                s += chars[i];
            }  else {
                s += "_";
            }
            s += " ";
        }

        return s;
    }


}
