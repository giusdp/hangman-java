package word;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class FileWordPicker implements WordPicker {

    @Override
    public Word randomPick() throws PickerException {

        Path path = Paths.get("src/wordlist.txt");

        try {
            List<String> words = Files.readAllLines(path);

            Random rand = new Random();
            int randomIndex = rand.nextInt(words.size());
            String s = words.get(randomIndex);
            return new Word(s);

        } catch (IOException e) {
            throw new PickerException("Errore durante lettura del file in FileWordPicker");
        }
    }

}
