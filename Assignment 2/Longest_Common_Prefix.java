class LCP {
    public String findLCP(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}

class Longest_Common_Prefix {
    public static void main(String[] args) {
        LCP ob = new LCP();
        
        String[] str1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + ob.findLCP(str1));
        
        String[] str2 = {"dog", "race", "car"};
        System.out.println("Longest Common Prefix: " + ob.findLCP(str2));
    }
}
