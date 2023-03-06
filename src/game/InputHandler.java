package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputHandler {

    public String getInput() {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        try {
            String input = reader.readLine();
            return input;
        } catch (Exception e) {
            System.err.println("Non riesco a leggere l'input: " + e.getMessage());
            return "";
        }
    }
}
