import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {
    private BufferedReader input;
    private BufferedReader inputN;
    Board b;

    public UserInput(Board board) {
        input = new BufferedReader(new InputStreamReader(System.in));
        this.b = board;
    }
    public UserInput(){
        inputN = new BufferedReader(new InputStreamReader(System.in));
    }
//takes players input, changes it to a integer and checks for exceptions and wrong input
    public int getNValue() {
        String stringNValue = null;
        int intNValue = 0;
        try {
                System.out.println("Please enter the ConnectN value: ");
                stringNValue = inputN.readLine();
                intNValue = Integer.parseInt(stringNValue);
                if (intNValue <= 1 || intNValue >= 7 ){
                    System.out.println("Please enter a number between 2 and 6");
                    getNValue();
                } else{
                    //skip
        }
        } catch (Exception e){
            System.out.println("" + e);
        }
        return intNValue;
    }
//Takes in users input and checks for exceptions
    public String getUserInput(){
        String toReturn = null;
        try {
            do {
                System.out.println("Enter a column number: ");
                toReturn = input.readLine();
            } while (!isValidInput(toReturn));
        } catch(Exception e){
            System.out.println("" + e);
        }

        return toReturn;
    }

    public boolean isValidInput(String input) {
        int intInput = 0;
        int range = b.getCol();

        try {
            intInput = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Input is not valid. Please try again.");
            return false;
        }

        for (int i = 1; i <= range; i++) {
            if (i == intInput) {
                return true;
            }
        }
        return false;
    }
}
