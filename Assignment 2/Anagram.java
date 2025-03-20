import java.util.Arrays;

class AnagramChecker {
    
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}

class Anagram {
    public static void main(String[] args) {
        
        AnagramChecker ob = new AnagramChecker();

        
        String s1 = "anagram", t1 = "nagaram";
        String s2 = "rat", t2 = "car";

        
        System.out.println("Is \"" + s1 + "\" an anagram of \"" + t1 + "\"? " + ob.isAnagram(s1, t1));
        System.out.println("Is \"" + s2 + "\" an anagram of \"" + t2 + "\"? " + ob.isAnagram(s2, t2));
    }
}
