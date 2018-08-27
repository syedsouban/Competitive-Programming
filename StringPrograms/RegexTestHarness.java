import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {

    public static void main(String[] args) throws IOException
    {
        String p,m;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter your regex: ");
            p=br.readLine();
            Pattern pattern = Pattern.compile(p);
            System.out.println("Enter input string to search: ");
            m=br.readLine();
            Matcher matcher = pattern.matcher(m);

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
}