import java.io.*;
import java.util.*;
public class ValidWordsWCharsGiven
{
    public static void main(String args[]) throws IOException
    {
        ArrayList<String> words = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s;
        for(int i=0;i<n;i++)
        {
            s=br.readLine();
            words.add(s);
        }
        int len;
        String chars=br.readLine();
        char[] ca;
        int match=0;
        for(String str:words)
        {
            match=0;
            len=str.length();
            for(int i=0;i<len;i++)
            {
                if(!(chars.contains((new Character(str.charAt(i))).toString())))
                    break;
                else
                {
                    match++;
                }
            }
            if(match==len)
                System.out.println(str);
        }
    }
}