import java.util.Random;

public class Computer {

    Random random;
// Generates a number between 1 and 7 
    public Computer() {
        random = new Random();
        random.nextInt(7);
    }

    public String getRandomNumber() {
        int x = random.nextInt(7)+1;
        String r = String.valueOf(x);
        return r;
    }

    }
