import java.util.Scanner;

class Sequence {
    void Display_Sequence(int l) {
        int a = 0, b = 1;  
        int power = 2;    
        
        System.out.println("The sequence up to " + limit + " terms:");
        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                
                System.out.print(a + ", ");
                int temp = a + b;
                a = b;
                b = temp;
            } else {
                
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
        obj.Display_Sequence(limit);
        sc.close();
    }
}
