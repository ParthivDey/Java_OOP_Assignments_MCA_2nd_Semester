class PasswordCheck {
    public boolean ValidPassword(String str) {
        if (str.length() < 4) return false;
        if (Character.isDigit(str.charAt(0))) return false;
        
        boolean Digit = false, Upper = false;
        
        for (char ch : str.toCharArray()) {
            if (Character.isWhitespace(ch) || ch == '/') return false;
            if (Character.isDigit(ch)) Digit = true;
            if (Character.isUpperCase(ch)) Upper = true;
        }
        
        return Digit && Upper;
    }
}

class Password {
    public static void main(String[] args) {
        PasswordCheck ob = new PasswordCheck();
        
        String p1 = "aA1_67";
        String p2 = "a987 abC012";
        
        System.out.println(ob.ValidPassword(p1) ? 1 : 0);
        System.out.println(ob.ValidPassword(p2) ? 1 : 0);
    }
}
