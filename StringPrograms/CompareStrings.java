import java.io.*;
import java.util.*;
public class CompareStrings
{
    public static int compareStrings(String s1,String s2)
    {
        int n1=s1.length();
        int n2=s2.length();
        for(int i=0;i<(n1<n2?n1:n2);i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
                return (s1.charAt(i)>s2.charAt(i)?1:-1);
            else
            {
                if(n1==n2&&i==n1-1)
                    return 0;
                else
                    continue;
            }
        }
        if(n1>n2)
            return 1;
        else
            return -1;
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
        String s2=br.readLine();
        System.out.println(compareStrings(s1,s2));
    }
}