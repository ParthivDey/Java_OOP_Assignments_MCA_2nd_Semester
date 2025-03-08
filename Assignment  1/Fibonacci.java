import java.io.*;

class Fib
{
    void Display_Fibonacci(int n)
    {
        int a = -1, b = 1, c = 0 ,s = 0;
	    for(int i = 1; i <= n; i++)
        {
            c = a + b;
            s = s + c;
            System.out.println(c);
            a = b;
            b = c;
        }
        System.out.println("Sum of Fibonacci series is "+s);
    }
}
class Fibonacci
{
    public static void main(String a[])
    {
	int n = 10;
    Fib ob = new Fib();
	ob.Display_Fibonacci(n);
    }
}