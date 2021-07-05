public class Board {
    public char[][] board;
    private int row;
    private int col;
    private int n;



    public Board(int row, int col, int n) {
        this.row = row;
        this.col = col;
        this.n = n;
        board = new char[row][col];
    }


    public boolean placeCounter(char player, int position){
        boolean placed = false;
        for(int i = board.length - 1; i >= 0; i--){
            if(!placed){
                if(board[i][position-1] == 0){
                    board[i][position-1] = player;
                    placed = true;
                }
                else {
                    // skip
                }
            }
        }
        return placed;
    }


    public boolean checkIfWon(char colour) {
        if (checkCount(colour) >= n) {
            return true;
        }
        else {
            return false;
        }
    }


    public int getCol() {

        return col;
    }

    public int checkCount(char colour) {
        int count = 0;
        int max = 0;
          // Performs the relevant check to see if the player has won
        // Horizontal
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == colour){
                    count = count + 1;
                    if(count >= max){
                        max = count;
                    }
                }
                else{
                    count = 0;
                }
            }
            count = 0;
        }
        // Vertical
        count = 0;
        for(int i=0; i<board[0].length; i++){
            for(int j=0; j<board.length; j++){
                if(board[j][i] == colour){
                    count = count + 1;
                    if(count >= max){
                        max = count;
                    }
                }
                else{
                    count = 0;
                }
            }
            count = 0;
        }

        //Down-right
        for (int i = 0; i < board.length; i++) {
            count = 0;
            for (int j = i, h = 0; j < board.length && h < board[0].length; j++, h++) {
                if (board[j][h] == colour) {
                    count = count + 1;
                    if(count >= max){
                        max = count;
                    }
                }
                else {
                    count = 0;
                }
            }
        }

        //Down-right (Up)
        for (int i = 1; i < board[0].length; i++) {
            count = 0;
            for (int j = 0, h = i; j < board.length && h < board[0].length; j++, h++) {
                if (board[j][h] == colour) {
                    count = count + 1;
                    if(count >= max){
                        max = count;
                    }
                }
                else {
                    count = 0;
                }
            }
        }


        //Up-right (Up)
        for (int i = board.length - 2; i >= 0; i--) {
            count = 0;
            for (int j = i, h = 0; j >= 0 && h < board[0].length; j--, h++) {
                if (board[j][h] == colour) {
                    count = count + 1;
                    if(count >= max){
                        max = count;
                    }
                }
                else {
                    count = 0;
                }
            }
        }

        // Up-right (down)
        for (int i = 0; i < board[0].length; i++) {
            count = 0;
            for (int j = board.length - 1, h = i; j >= 0 && h < board[0].length; j--, h++) {
                if (board[j][h] == colour) {
                    count = count + 1;
                    if(count >= max){
                        max = count;
                    }
                }
                else {
                    count = 0;
                }
            }
        }

        return max;
    }

}