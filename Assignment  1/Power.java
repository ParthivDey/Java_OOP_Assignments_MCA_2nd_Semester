import java.util.Scanner;

class FindPower {
    void Display_Power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}

class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent (power): ");
        int exponent = sc.nextInt();
        FindPower obj = new FindPower();
        obj.Display_Power(base, exponent);
        sc.close();
    }
}
