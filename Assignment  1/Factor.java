import java.util.Scanner;

class Factors {
    
    void Display_Factors(int num) {
        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();
        Factors obj = new Factors();
        obj.Display_Factors(number);
        sc.close();
    }
}
