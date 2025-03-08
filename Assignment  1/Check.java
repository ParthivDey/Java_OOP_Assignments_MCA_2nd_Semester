import java.util.Scanner;

class PrimeSum {
    
    boolean IsPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    
    void checkPrimeSum(int n) {
        boolean found = false;
        for (int i = 2; i <= n / 2; i++) {
            if (IsPrime(i) && IsPrime(n - i)) {
                System.out.println(n + " can be expressed as sum of two prime numbers: " + i + " + " + (n - i));
                found = true;
            }
        }
        if (!found) {
            System.out.println(n + " cannot be expressed as sum of two prime numbers.");
        }
    }
}

class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        PrimeSum obj = new PrimeSum();
        obj.checkPrimeSum(num);
        sc.close();
    }
}
