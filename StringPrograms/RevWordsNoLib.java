import java.util.*;
import java.io.*;
public class RevWordsNoLib
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ca = br.readLine().toCharArray();
        int k=ca.length-1,j;
        char t;
        String output="";
        for(int i=ca.length-1;i>=0;i--)
        {
            if(ca[i]==' '||i==0)
            {
                if(i==0)
                    j=0;
                else
                    j=i+1;
                for(int m=j;m<=k;m++)
                {
                    output=output+ca[m];
                }
                output=output+" ";
                k=i-1;
            }
        }
        System.out.println(output);
    }
}