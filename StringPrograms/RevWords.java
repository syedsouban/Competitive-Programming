import java.io.*;
import java.util.*;
public class RevWords
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] sArr=s.split(" ");
        ArrayList<String> sList = new ArrayList<String>(Arrays.asList(sArr));
        Collections.reverse(sList);
        sArr=sList.toArray(new String[0]);
        String output="";
        for(int i=0;i<sArr.length;i++)
        {
            output=output+" "+sArr[i];
        }
        System.out.println(output);
    }
}