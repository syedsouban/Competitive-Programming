import java.util.*;
import java.io.*;
public class FibonacciUsingDPBottumUp
{
    static int lookup[];
    static int fib(int n)
    {
        lookup=new int[n+1];
        lookup[0]=0;
        lookup[1]=1;
        for(int i=2;i<=n;i++)
            lookup[i]=lookup[i-1]+lookup[i-2];
        return lookup[n];
    }
    public static void main(String args[])
    {
        
        int n=10;
        for(int i=1;i<=n;i++)
        System.out.println(fib(i));
    }
}