import java.util.Scanner;

class Series {
    // Function to calculate factorial of a number
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to calculate the sum of the series
    void calculateSum(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / factorial(i);
        }
        System.out.println("Sum of the series: " + sum);
    }
}

class Series_sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        Series obj = new Series();
        obj.calculateSum(n);
        sc.close();
    }
}
