import java.util.Scanner;


class StringProcessor {
    
    public String toTitleCase(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder titleCaseSentence = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                titleCaseSentence.append(Character.toUpperCase(word.charAt(0)))
                                  .append(word.substring(1))
                                  .append(" ");
            }
        }
        
        return titleCaseSentence.toString().trim();
    }
}


class ContentEditingSoftware {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        sc.close();
        
        
        StringProcessor ob = new StringProcessor();
        String titleCaseSentence = ob.toTitleCase(sentence);
        
        System.out.println("Title Case: " + titleCaseSentence);
    }
}
