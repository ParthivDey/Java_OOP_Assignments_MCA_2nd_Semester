import java.util.Scanner;

class Sequence {
    void printSequence(int limit) {
        int a = 0, b = 1;  // Fibonacci initial values
        int power = 2;    // Power of 2 initial value
        
        System.out.println("The sequence up to " + limit + " terms:");
        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0) {
                // Even index - Fibonacci number
                System.out.print(a + ", ");
                int temp = a + b;
                a = b;
                b = temp;
            } else {
                // Odd index - Power of 2
                System.out.print(power + ", ");
                power *= 2;
            }
        }
    }
}

class Sequence_limit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit of the sequence: ");
        int limit = sc.nextInt();
        Sequence obj = new Sequence();
        obj.printSequence(limit);
        sc.close();
    }
}
