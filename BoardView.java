public class BoardView {
    private char[][] board;

    public BoardView(char[][] board) {
        this.board = board;
        printBoard(board);
    }
  //prints the board to the console
    void printBoard(char[][] board) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                char c = board[i][j];
                if(c != 0){
                    System.out.print("| " + c + " ");
                }
                else{
                    System.out.print("|   ");
                }
            }
            System.out.println("|");
        }
        System.out.println("  1   2   3   4   5   6   7  ");
    }
}