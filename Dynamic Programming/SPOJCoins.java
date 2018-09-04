import java.io.*;
import java.util.*;
public class SPOJCoins
{
    static long[] dp;
    
    static void init(int n)
    {
        
        dp =  new long[n+1];
        for(int i=0;i<=n;i++)
        {
            dp[i]=-1;
        }
    }
    
    static long calc(long n)
    {
        if(n<=1000000)
        {
         if(n<=3)
            return n;
         else
         {
             if(dp[(int)n]!=-1)
             {
                 return dp[(int)n];
             }
             else
             {
                 dp[(int)n]=Math.max(n,calc(n/2)+calc(n/3)+calc(n/4));
                 // ans=Math.max(n,calc(n/2)+calc(n/3)+calc(n/4));
             }
         }
        }
        else
         return Math.max(n,calc(n/2)+calc(n/3)+calc(n/4));
        
        return dp[(int)n];
    }
    public static void main(String args[]) throws IOException
    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
//        int T=Integer.parseInt(br.readLine());
//        Long[] arr=new Long[10];
        
//        int max=0;
//        for(int i=0;i<T;i++)
//        {
//            arr[i]=Long.parseLong(br.readLine());
////            if(max<arr[i])
////                max=arr[i];
//        }
        
        init(1000000);
        while(sc.hasNext())
        {
            System.out.println(calc((sc.nextLong())));
        }
    }
}