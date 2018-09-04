import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class isSumOfSomeNS {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Write your code here
        
        int T,n,s;
        int arr[];
        String[] str;
        int sum=0;
        int k;
        boolean flag=false;
        T=Integer.parseInt(br.readLine());
        for(int m=0;m<T;m++)
        {
            flag=false;
            n=Integer.parseInt(br.readLine());
            arr=new int[n];
            str=br.readLine().split(" ");
            for(int i=0;i<str.length;i++)
            {
                arr[i]=Integer.parseInt(str[i]);
            }
            Arrays.sort(arr);
            s=Integer.parseInt(br.readLine());
            if(s==0)
            {
                System.out.println("YES");
                continue;
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i==j)
                        continue;
                    if(arr[i]+arr[j]>s)
                        continue;
                    else
                    {
                        k=j+1;
                        sum=arr[i]+arr[j];
                        
                        if(sum==s)
                        {
                            System.out.println("YES");
                            flag=true;
                            break;
                        }
                        while(k<n)
                        {
            
                            if(sum+arr[k]==s)
                            {
                                System.out.println("YES");
                                System.out.println(sum+arr[k]+"i: "+i+"j: "+j+"k: "+k);
                                flag=true;
                                break;
                            }
                            else if(sum+arr[k]>s)
                                k++;
                            else if(sum+arr[k]<s)
                            {
                                sum=sum+arr[k];
                                k++;
                            }
                        }
                    }
                    if(flag)
                        break;
                }
                if(flag)
                    break;
            }
            if(!flag)
            System.out.println("NO");

        }
    }
}
