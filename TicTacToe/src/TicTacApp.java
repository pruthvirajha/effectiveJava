

public class TicTacApp {
    private final static int GRID_SIZE = 9;
    private static TicTacGrid ticTacGrid;
    private static InputReader inputReader;
    private static Player player1;
    private static Player player2;

    private static void createGameGrid() {
        ticTacGrid = new TicTacGrid(GRID_SIZE);
    }

    public static void main(String args[]) {
        createGameGrid();
        ticTacGrid.printGrid();
        inputReader = new InputReader();


        System.out.println("Enter the inputs");
        System.out.println("Player 1 enter your name");
        String player1Name = inputReader.readInput();
        System.out.println("Player 1 enter your Symbol");
        String player1Symbol = inputReader.readInput();
        player1 = new Player(player1Name, player1Symbol);
        System.out.println(player1.toString());

        System.out.println("------------------------------------------");

        System.out.println("Player 2 enter your name");
        String player2Name = inputReader.readInput();
        System.out.println("Player 2 enter your Symbol");
        String player2Symbol = inputReader.readInput();
        player2 = new Player(player2Name, player2Symbol);
        System.out.println(player2.toString());

        int inputCount = 0;
        Player currentPlayer = player1;
        while (inputCount < GRID_SIZE) {

            System.out.println(currentPlayer.getName() + " Enter a number between 1 to 9 to fill the value to specific position");
            String input = inputReader.readInput();
            int inputIntegerVal;
            try {
                inputIntegerVal = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number");
                continue;
            }

            try {
                ticTacGrid.insertSymbol(inputIntegerVal, currentPlayer.getSymbol());

                if (ticTacGrid.isSequenceCompleted(inputIntegerVal, currentPlayer.getSymbol())) {
                    System.out.println(currentPlayer.getName() + " won the game");
                    System.exit(0);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("This position has been taken already, please enter another position");
                continue;
            }
            ticTacGrid.printGrid();
            currentPlayer = switchPlayer(currentPlayer);
            inputCount++;
        }
    }

    public static Player switchPlayer(Player currentPlayer) {
        if (player2.equals(currentPlayer)) {
            return player1;
        }
        return player2;
    }
}
