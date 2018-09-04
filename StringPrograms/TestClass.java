import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s =  br.readLine().split(" ");
        ArrayList<HashSet> al = new ArrayList<HashSet>();
        int m,n;
        n=Integer.parseInt(s[0]);
        m=Integer.parseInt(s[1]);
        int a,b;
        HashSet hs = new HashSet();
        for(int i=0;i<m;i++)
        {
            s =  br.readLine().split(" ");
            a=Integer.parseInt(s[0]);
            b=Integer.parseInt(s[1]);
            for(int k=a;k<=b;k++)
                hs.add(k);
        }
        int flag=0;
        for(int i=0;i<al.size();i++)
        {
            for(int j=i+1;j<al.size();j++)
            {
                System.out.println((Collections.disjoint(al.get(i),al.get(j))));
//                {
//                    flag=-1;
//                    break;
//                }
            }
        }
        if(flag==0)
        System.out.println("All ok!");
    }
}
