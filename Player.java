public class Player {

    private char[][] board;
    boolean hasWon = false;
    Board b;
    BoardView boardView;
    boolean placed;
    int move;
    

    public Player(Board b){
        this.b = b;
        board = b.board;
        boardView = new BoardView(board);
    }

    public boolean hasWon() {
        if (hasWon) {
            return true;
        }
        else {
            return false;
        }
    }

    public void playGame(char player, String input) {
        move = Integer.parseInt(input);
        placed = b.placeCounter(player, move);
        if (!placed) {
            System.out.println("Column full. Please try again.");
            playGame(player, new UserInput(b).getUserInput());
        }
        hasWon = b.checkIfWon(player);
        boardView.printBoard(board);
    }

}