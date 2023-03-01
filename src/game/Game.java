package game;

import word.*;

public class Game {

    private Word pickedWord;
    private Printer printer;
    private GameState state;

    public Game() {
        WordPicker picker = new WordPicker();
        printer = new Printer();
        pickedWord = picker.randomPick();
        state = GameState.START;
    }

    public void run(){
        printer.print(pickedWord.getWord());
        state = GameState.PLAYING;

    }


}
