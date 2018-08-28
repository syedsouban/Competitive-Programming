import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class OrderOfChars
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String pI = br.readLine();
        int n=pI.length();
        String pS = "^[^"+pI+"]*";
        int j,k;
        String temp="";
        for(int i=0;i<n;i++)
        {
            temp="";
            pS=pS+pI.charAt(i);
            j=i-1;
            while(j>=0)
            {
                temp=temp+pI.charAt(j);
                j--;
            }
            k=i+2;
            while(k<n)
            {
                temp=temp+pI.charAt(k);
                k++;
            }
            if(temp.length()>0)
            pS=pS+ "[^"+temp+"]*";
            else
                pS=pS+".*";
        }
        pS=pS+"$";
        System.out.println(pS);
        Pattern pattern = Pattern.compile(pS);
        Matcher matcher = pattern.matcher(s);
        boolean found = false;
        while (matcher.find()) {
                System.out.printf("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d\n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
                System.out.println("No match found\n");
            }
    }
}