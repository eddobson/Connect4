public class Main {

    public static void main(String[] args){
        PlayGame connect4 = new PlayGame();
        System.out.println("Welcome to Connect 4");
        System.out.println("There are 3 players red, yellow and blue");
        System.out.println("Player 1 is Red, Computer 1 is Yellow, Computer 2 is Blue");
        System.out.println("To play the game type in the number of the column you want to drop you counter in");
        System.out.println("A player wins by connecting 4 counters in a row - vertically, horizontally or diagonally");
        System.out.println("");
        //calls the playGame method to start the game
        connect4.playGame();
    }


}