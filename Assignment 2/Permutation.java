class PermutationGenerator {
    
    public void generatePermutations(String str, String result) {
        
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        
        
        for (int i = 0; i < str.length(); i++) {
            
            char currentChar = str.charAt(i);
            
            String remaining = str.substring(0, i) + str.substring(i + 1);
            
            generatePermutations(remaining, result + currentChar);
        }
    }
}

class Permutation {
    public static void main(String[] args) {
        String input = "XYZ";
        PermutationGenerator ob = new PermutationGenerator();
        ob.generatePermutations(input, "");
    }
}
