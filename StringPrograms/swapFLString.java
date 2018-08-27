import java.io.*;
import java.util.*;
public class swapFLString
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String output="";
        String[] inputArr = input.split(" ");
        int n;
        for(String s:inputArr)
        {
            n=s.length();
            char[] ca = s.toCharArray();
            char t;
            t=ca[0];
            ca[0]=ca[n-1];
            ca[n-1]=t;
            output=output+" "+new String(ca);
        }
        System.out.println(output);
    }
}