import java.io.*;
import java.util.*;
public class FibonacciUsingDPTopDown
{
    int MAX=100;
    int lookup[] = new int[MAX];
    void init()
    {
        for(int i=0;i<MAX;i++)
        {
            lookup[i]=-1;
        }
    }
    
    int fib(int n)
    {
        if(lookup[n]==-1)
        {
            if(n<=1)
                lookup[n]=n;
            {
                for(int i=2;i<=n;i++)
                {
                    lookup[i]=fib(i-1)+fib(i-2);
                }
            }
        }
        return lookup[n];
    }
    public static void main(String args[])
    {
        FibonacciUsingDPTopDown futd = new FibonacciUsingDPTopDown();
        futd.init();
        for(int i=1;i<=10;i++)
        System.out.println(futd.fib(i));
    }
}