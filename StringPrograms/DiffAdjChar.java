import java.util.*;
import java.io.*;
class MultiChar
    {
        int count;
        char letter;
        MultiChar(int count,char letter)
        {
            this.count=count;
            this.letter=letter;
        }
    }
public class DiffAdjChar
{
    
    public static String reorganizeString(String s)
    {
        int N=s.length();
        int[] freq=new int[26];
        s=s.toLowerCase();
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        }
        PriorityQueue<MultiChar> pq = new PriorityQueue<>(new Comparator<MultiChar>(){
            public int compare(MultiChar mc1, MultiChar mc2)
            {
                if(mc1.count==mc2.count)
                    return mc1.letter-mc2.letter;
                return mc2.count-mc1.count;
            }
        });
        for(int i=0;i<26;i++)
        {
            if(freq[i]>0)
            {
                if(freq[i]>((N+1)/2))
                       return "";
                else
                {
                    pq.add(new MultiChar(freq[i],(char)(i+'a')));
                }
            }
        }
        String result="";
        while(pq.size()>=2)
        {
            MultiChar mc1=pq.poll();
            MultiChar mc2=pq.poll();
            
            result=result+mc1.letter;
            result=result+mc2.letter;
            
            if(--mc1.count>0) pq.add(mc1);
            if(--mc2.count>0) pq.add(mc2);
            
            
        }
        if(pq.size()>0) result=result+pq.poll().letter;
        return result;
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        System.out.println(reorganizeString(s));
    }
}