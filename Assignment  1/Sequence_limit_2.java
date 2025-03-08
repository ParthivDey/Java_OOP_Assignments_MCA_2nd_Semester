import java.util.Scanner;

class Sequence {
    void printSequence(int limit) {
        int a = 0, b = 1;  // Fibonacci initial values
        int negative = -1; // Starting negative number

        System.out.println("The sequence up to " + limit + " terms:");
        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0) {
                // Even index - Fibonacci number
                System.out.print(a + ", ");
                int temp = a + b;
                a = b;
                b = temp;
            } else {
                // Odd index - Arithmetic progression (-1, -4, -7, -10,...)
                System.out.print(negative + ", ");
                negative -= 3;
            }
        }
    }
}

class Sequence_limit_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit of the sequence: ");
        int limit = sc.nextInt();
        Sequence obj = new Sequence();
        obj.printSequence(limit);
        sc.close();
    }
}
