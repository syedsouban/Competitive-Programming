import java.io.*;
import java.util.*;
public class CodeA
{
    public static void main(String args[])
    {
        
        int c=0,d=0;
        
        List<List<Integer>> grid;
        for(List l:grid)
        {
            c=0;
            d=0;
            int[][] a=l.toArray();
            SortedSet<Integer> x = new TreeSet<>();
        SortedSet<Integer> y = new TreeSet<>();

        {
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(a[i][0]==a[j][0])
                {
                    x.add(a[i][1]);
                    x.add(a[j][1]);
                    c++;
                }
                if(a[i][1]==a[j][1])
                {
                    y.add(a[i][0]);
                    y.add(a[j][0]);
                    d++;
                }
            }
        }
        }
        ArrayList<Integer> X=new ArrayList<Integer>();
        ArrayList<Integer> Y=new ArrayList<Integer>();
        if(c!=3||d!=3)
            System.out.println("No");
        
        
        else
        {
            X.addAll(x);
            Collections.sort(X);
            
            Y.addAll(y);
            Collections.sort(Y);
            
            if(((X.get(0)+X.get(2))/2)==(X.get(1))&&((Y.get(0)+Y.get(2))/2)==(Y.get(1)))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        }
        
    }
}