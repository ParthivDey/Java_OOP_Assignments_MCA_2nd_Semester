import java.util.HashSet;
import java.util.Scanner;


class UniqueCharacterChecker {
    private String input;

    
    public UniqueCharacterChecker(String input) {
        this.input = input;
    }

    
    public boolean hasUniqueCharacters() {
        HashSet<Character> charSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!charSet.add(c)) {
                return false; 
            }
        }
        return true; 
    }
}


public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        
        UniqueCharacterChecker checker = new UniqueCharacterChecker(userInput);

        
        if (checker.hasUniqueCharacters()) {
            System.out.println("All characters are unique.");
        } else {
            System.out.println("String contains duplicate characters.");
        }

        scanner.close();
    }
}
