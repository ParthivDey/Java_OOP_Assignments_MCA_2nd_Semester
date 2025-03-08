import java.util.Scanner;

class Sequence {
    // Function to calculate factorial of a number
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to print the sequence
    void Display_Sequence(int limit) {
        int even = 2; // Starting even number
        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0) {
                // Even index - Print even number
                System.out.print(even + ", ");
                even += 2;
            } else {
                // Odd index - Print factorial of the index/2+1
                int fact = factorial(i / 2 + 1);
                System.out.print(fact + ", ");
            }
        }
    }
}

class Sequence_limit_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit of the sequence: ");
        int limit = sc.nextInt();
        Sequence obj = new Sequence();
        obj.Display_Sequence(limit);
        sc.close();
    }
}
