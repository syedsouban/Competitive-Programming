import java.io.*;
import java.util.*;
public class CoinChangeProblem
{

    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp[] = new String[2];
        temp=br.readLine().split(" ");
        
        long amount=Long.parseLong(temp[0]);
        
        int n = Integer.parseInt(temp[1]);
        String[] s = br.readLine().split(" ");
        int[] denom=new int[s.length];
        long[] comb=new long[(int)amount+1];
        for(int i = 0;i<s.length;i++)
        {
            denom[i]=Integer.parseInt(s[i]);
        }
        comb[0]=1;
        for(int i=0;i<denom.length;i++)
        {
            for(int j=1;j<=amount;j++)
            {
                if(j>=denom[i])
                    comb[j]=comb[j]+comb[j-denom[i]];
            }
        }
        System.out.println(comb[(int)amount]);
    }
}