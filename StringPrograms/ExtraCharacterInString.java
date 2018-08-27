import java.io.*;
import java.util.*;
public class ExtraCharacterInString
{
    public static void main(String args[]) throws IOException
    {
        String s1="",s2="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s1=br.readLine();
        s2=br.readLine();
        int n1=s1.length();
        int n2=s2.length();
        int max=(n1<n2?n1:n2);
        char[] ca1=s1.toCharArray();
        Arrays.sort(ca1);
        char[] ca2=s2.toCharArray();
        Arrays.sort(ca2);
        
        if(ca1[n1-1]!=ca2[n2-1])
        {
            if(n1>n2)
            {
                System.out.println(ca1[n1-1]);
            }
            else
            {
                System.out.println(ca2[n2-1]);
            }
        }
        
        else
        {
                    for(int i=0;i<max;i++)
                    {
                        if(ca1[i]!=ca2[i])
                        {
                            if(n1>n2)
                                System.out.println(ca1[i]);
                            else
                                System.out.println(ca2[i]);
                        }
                    }
        }

    }
}