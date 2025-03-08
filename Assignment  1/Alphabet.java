class Alphabets {
    void Display_Alphabets() {
        System.out.println("Alphabets from A to Z :");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}

class Alphabet {
    public static void main(String[] args) {
        Alphabets obj = new Alphabets();
        obj.Display_Alphabets();
    }
}
