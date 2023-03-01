import game.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.run();
    }

    public static class Printer {

        public void print(String toPrint) {
            System.out.println(toPrint);
        }

    }
}