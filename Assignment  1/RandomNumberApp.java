import java.util.Random;

class RandomNumberGenerator {
    void generateRandomNumbers() {
        Random rand = new Random();
        System.out.println("5 Random Numbers between 1 to 100 are:");
        for (int i = 1; i <= 5; i++) {
            int randomNumber = rand.nextInt(100) + 1; 
            System.out.println("Random Number " + i + ": " + randomNumber);
        }
    }
}

class RandomNumberApp {
    public static void main(String[] args) {
        RandomNumberGenerator obj = new RandomNumberGenerator();
        obj.generateRandomNumbers();
    }
}
