package game;

import word.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Game {
    private Word pickedWord;
    private Printer printer;
    private GameState state;
    private InputHandler inputHandler;

    private int triesLeft;

    public Game() {
        WordPicker picker = new ArrayWordPicker();
        printer = new Printer();
        inputHandler = new InputHandler();

        triesLeft = 5;

        try {
            pickedWord = picker.randomPick();
        } catch (PickerException e) {
            System.err.println(e.getMessage());
            pickedWord = new Word("pippo");
        }
        state = GameState.PLAYING;
    }

    public void run() {
        printer.print(pickedWord.getWord());

        while (state == GameState.PLAYING) {
            printer.print("Inserisci una lettera: ");
            String input = inputHandler.getInput();

            char guess = input.charAt(0);

            boolean wasGuessed = pickedWord.checkGuess(guess);
            if (wasGuessed) {
                if (pickedWord.wasGuessed()) {
                    state = GameState.WIN;
                }
            } else {
                triesLeft -= 1;
                if (triesLeft == 0) {
                    state = GameState.LOSE;
                }
            }

            printer.print(pickedWord.getWord());
            printer.print("Tentativi rimasti:" + triesLeft);

            if (input.equals("quit")) {
                state = GameState.EXIT;
            }
        }

        if (state == GameState.WIN) {
            printer.print("Hai indovinato");
        } else if (state == GameState.LOSE) {
            printer.print("Hai perso, la parola era: " + pickedWord.getVisibleWord());
        }
    }
}
