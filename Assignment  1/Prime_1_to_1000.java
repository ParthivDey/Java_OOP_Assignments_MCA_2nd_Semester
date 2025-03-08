import java.io.*;

class Prime
{
    void Display_Prime()
    {
        for(int i = 1; i <= 1000; i++)
        {
            boolean IsPrime = true; 
            for(int j = 2; j <= Math.sqrt(i); j++)
            {
                if(i % j == 0) 
                {
                    IsPrime = false;
                    break;
                }
            }
            if(i > 1 && IsPrime)
            {
                System.out.println(i);
            }
        }
    }
}

class Prime_1_to_1000
{
    public static void main(String a[])
    {
        Prime ob = new Prime();
        ob.Display_Prime();
    }
}
