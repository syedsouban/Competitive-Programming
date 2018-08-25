import java.io.*;
import java.util.*;
public class PanLipo
{
public static void main(String args[]) throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    int[] letterFrequency = new int[26];
    char c;
    s=s.toLowerCase();
    for(int i=0;i<s.length();i++)
    {
        c=s.charAt(i);
        if(c>='a'&&c<='z')
        {
            letterFrequency[c-'a']++;
        }
    }
    boolean isPanLipo=false;
    int noOfLettersMissed=0;
    for(int i=0;i<26;i++)
    {
        if(letterFrequency[i]==0)
        {
            noOfLettersMissed++;
        }
    }
    if(noOfLettersMissed==1)
    {
        System.out.println(s+" is a pangrammatic lipogram");
    }
    else
    {
        System.out.println(s+" is not a pangrammatic lipogram");
    }
}
}
