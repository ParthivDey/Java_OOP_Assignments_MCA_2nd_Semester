class SumDivisibleBy7 {
    void Display_Sum() {
        int sum = 0;
        System.out.println("Numbers divisible by 7 between 100 and 200 are:");
        for (int i = 101; i < 200; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nSum of all numbers divisible by 7 is: " + sum);
    }
}

class Divisible_by_7 {
    public static void main(String[] args) {
        SumDivisibleBy7 obj = new SumDivisibleBy7();
        obj.Display_Sum();
    }
}
