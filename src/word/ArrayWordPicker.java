package word;

import java.util.Random;

public class ArrayWordPicker implements WordPicker {

    private String[] words;

    public ArrayWordPicker() {
        words = new String[]{
                "pippo",
                "paperino",
                "topolino",
                "java"
        };
    }

    public Word randomPick() throws PickerException {
        Random rand = new Random();
        int randomIndex = rand.nextInt(words.length);
        return new Word(words[randomIndex]);
    }

}
