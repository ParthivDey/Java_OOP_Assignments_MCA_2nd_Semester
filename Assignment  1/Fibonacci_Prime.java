import java.io.*;

class Prime {
    boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    void Display_Fibonacci_Primes() {
        int a = 0, b = 1, c;
        int count = 0;
        System.out.println("First 8 Prime Numbers in Fibonacci Sequence:");

        while (count < 8) {
            c = a + b;
            a = b;
            b = c;
            if (isPrime(c)) {
                System.out.print(c + " ");
                count++;
            }
        }
        System.out.println();
    }
}

class Fibonacci_Prime {
    public static void main(String[] args) {
        Prime obj = new Prime();
        obj.Display_Fibonacci_Primes();
        System.out.println("First 8 Positive Prime Numbers:");
        int num = 1;
        int count = 0;
        while (count < 8) {
            if (obj.isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
