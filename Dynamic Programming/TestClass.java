import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        HashSet<Long> setA = new HashSet<>();
        HashSet<Long> setB = new HashSet<>();
        HashSet<Long> inter;
  for(long j=1;(j<=Math.sqrt(a));j++)
   { 
    if(a%j==0)
    {
     if(a/j==j)
     {
      setA.add(j);
    //   n=n/j;
     }
     
     else
     {
         setA.add(j);
         setA.add(a/j);
     } 
    }
   }
   inter = new HashSet<>(setA);
        for(long j=1;j<=(Math.sqrt(b));j++)
   { 
    if(b%j==0)
    {
     if(b/j==j)
     {
      setB.add(j);
    //   n=n/j;
     }
     
     else
     {
         setB.add(j);
         setB.add(b/j);
     } 
    }
      
   }
            inter.retainAll(setB);
            System.out.println(inter.size());
    
}
}
