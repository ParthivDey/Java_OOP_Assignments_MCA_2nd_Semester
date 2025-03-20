import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ProfanityFilter {
    private List<String> badWords;

    public ProfanityFilter(List<String> badWords) {
        this.badWords = badWords;
    }

    public String filterText(String text) {
        for (String word : badWords) {
            text = text.replaceAll("(?i)\\b" + word + "\\b", "***");
        }
        return text;
    }
}

public class OffensiveText {
    public static void main(String[] args) {
        List<String> badWordsList = Arrays.asList("bad", "ugly", "stupid");

        ProfanityFilter filter = new ProfanityFilter(badWordsList);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();
        scanner.close();

        String filteredText = filter.filterText(inputText);
        System.out.println("Filtered text: " + filteredText);
    }
}
