import java.util.*;

class PhoneNumberMapping {
    private static final String[] mapping = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static String getLetters(char digit) {
        return mapping[digit - '0'];
    }
}

class LetterCombinations {
    public List<String> getCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        backtrack(result, digits, new StringBuilder(), 0);
        return result;
    }

    private void backtrack(List<String> result, String digits, StringBuilder current, int index) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = PhoneNumberMapping.getLetters(digits.charAt(index));
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(result, digits, current, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}

public class DigitToLetterMapping {
    public static void main(String[] args) {
        LetterCombinations generator = new LetterCombinations();
        System.out.println(generator.getCombinations("23"));
    }
}
