import java.util.Scanner;

class FindGCD {
    void Display_GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD of the given numbers is: " + a);
    }
}

class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        FindGCD obj = new FindGCD();
        obj.Display_GCD(num1, num2);
        sc.close();
    }
}
