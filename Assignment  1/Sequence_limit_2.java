import java.util.Scanner;

class Sequence {
    void printSequence(int l) {
        int a = 0, b = 1;  
        int negative = -1; 

        System.out.println("The sequence up to " + l + " terms:");
        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                
                System.out.print(a + ", ");
                int temp = a + b;
                a = b;
                b = temp;
            } else {
                
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
        int l = sc.nextInt();
        Sequence obj = new Sequence();
        obj.printSequence(l);
        sc.close();
    }
}
