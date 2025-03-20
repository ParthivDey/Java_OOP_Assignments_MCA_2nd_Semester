import java.util.Scanner;

class WordProcessor {
    
    public String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            
            word = word.replaceAll("[^a-zA-Z]", "");
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}

class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        
        
        WordProcessor ob = new WordProcessor();
        String longestWord = ob.findLongestWord(sentence);
        
        
        System.out.println("Longest Word: " + longestWord);
        
        sc.close();
    }
}
