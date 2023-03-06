package word;

public class Word {

    private String word;
    private boolean[] guessedLetters;

    public Word(String word) {
        this.word = word;
        this.guessedLetters = new boolean[this.word.length()];
    }

    public String getVisibleWord(){
        return this.word;
    }
    public boolean wasGuessed(){
        for (boolean b : guessedLetters) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public boolean checkGuess(char guessLetter) {
        boolean b = false;
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (guessLetter == letters[i]) {
                guessedLetters[i] = true;
                b = true;
            }
        }
        return b;
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
