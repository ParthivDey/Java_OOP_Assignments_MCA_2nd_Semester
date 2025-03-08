import java.util.Scanner;

class Palindromes {
    void checkPalindrome(int num) {
        int originalNum = num;
        int reverse = 0;

        
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        
        if (originalNum == reverse) {
            System.out.println(originalNum + " is a Palindrome number.");
        } else {
            System.out.println(originalNum + " is not a Palindrome number.");
        }
    }
}

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Palindrome: ");
        int num = sc.nextInt();
        Palindromes obj = new Palindromes();
        obj.checkPalindrome(num);
        sc.close();
    }
}
