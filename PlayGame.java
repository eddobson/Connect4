public class PlayGame {
    public static void playGame() {
        UserInput nInput = new UserInput();
        final int rows = 6;
        final int cols = 7;
        final int n = nInput.getNValue();

        Board board = new Board(rows, cols, n);
        Player player = new Player(board);
        Computer computer = new Computer();
        UserInput uInput = new UserInput(board);
        String c;
        char[] playersToken = {'r', 'y','b'};
        char colour;
        int i = 0;


//alternates players
        boolean win = false;
        while(!win){
            colour = playersToken[i % playersToken.length];
            if (i % playersToken.length == 0) {
                c = uInput.getUserInput();
            } else if(i % playersToken.length == 0){
                c = computer.getRandomNumber();
            } else {
                c = computer.getRandomNumber();
            }
            player.playGame(colour, c);
            win = player.hasWon();
            if (win) {
                System.out.println("Player " + colour + " has won!!!");
            }
            i++;
        }
        return;
    }
}
