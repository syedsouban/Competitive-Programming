import java.util.*;
import java.io.*;
public class mappingToNewCharset
{
    public static void main(String args[]) throws IOException
    {
        HashMap<Character,Character> nCsMapping = new HashMap<Character,Character>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String charset=br.readLine();
        String word=br.readLine();
        for(int i=0;i<26;i++)
        {
            nCsMapping.put(charset.charAt(i),(char)('a'+i));
        }
        for(int i=0;i<word.length();i++)
        {
            System.out.print(nCsMapping.get(word.charAt(i)));
        }
    }
}