import java.io.*;
import java.util.*;
public class LCS
{
    
    static int getLCS(char[] X, char[] Y, int m, int n)
    {
        int[][] table = new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0||j==0)
                    table[i][j]=0;
                else if(X[i-1]==Y[j-1])
                {
                    table[i][j]=table[i-1][j-1]+1;
                    System.out.print(X[i-1]);
                }
                    
                else
                    table[i][j]=Math.max(table[i][j-1],table[i-1][j]);
            }
        }
        return table[m][n];
    }
    public static void main(String args[])
    {
        String a="ghet";
        String b="ifget";
        char[] s = a.toCharArray();
        char[] t = b.toCharArray();
        getLCS(s,t,s.length,t.length);
    }
}