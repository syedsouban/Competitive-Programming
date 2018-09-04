import java.io.*;
import java.util.*;
public class SPOJAcode
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L;
        char[] ca=new char[5001];
        char c1,c2;
        int[] dp;
        String input;
        while(true)
        {
            dp=new int[5001];
            input=br.readLine();
            ca = input.toCharArray();
            if(ca[0]=='0')
                    break;
            L=input.length();
            dp[0]=1;
            dp[1]=1;
            for(int i=2;i<=L;i++)
            {
                
                c1=ca[i-1];
                c2=ca[i-2];
                if(c2=='1'||(c2=='2'&&c1<='6'))
                {
                    dp[i]+=dp[i-2];
                }
                if(c1!='0')
                    dp[i]+=dp[i-1];
            }
            System.out.println(dp[L]);
        }
    }
}