import java.io.*;
import java.util.*;
public class PatternOccurences
{
    public static void main(String args[]) throws IOException
    {
        int count=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String p = br.readLine();
        String s = br.readLine();
        int index;
        index=s.indexOf(p);
        while(index!=-1)
        {
                s=(s.substring(0,index)+s.substring(p.length()+index));
                count++; 
                index=s.indexOf(p);
        }
        System.out.println(count);
    }
}