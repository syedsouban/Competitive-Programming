import java.io.*;
import java.util.*;
public class RangeString
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        String number1,number2;
        int no1,no2;
        String temp="";
        char[] ichar=input.toCharArray();
        int n=input.length();
        int j;
        for(int i=0;i<n;i++)
        {
            if(ichar[i]=='-')
            {
                j=i-1;
                number1="";
                number2="";
                while(j>=0)
                {
                    if(ichar[j]==',')
                        break;
                    number1=number1+ichar[j];
                    j--;
                }
                j=i+1;
                while(j<n)
                {
                    if(ichar[j]==',')
                        break;
                    number2=number2+ichar[j];
                    j++;
                }
                StringBuilder t=new StringBuilder(number1);
                number1=t.reverse().toString();
                no1=Integer.parseInt(number1);
                no2=Integer.parseInt(number2);
                temp="";
                for(int k=no1+1;k<no2;k++)
                {
                    if(k==no1+1) temp=temp+",";
                    temp=temp+k+",";
                }
                input=input.replaceFirst("-",temp);
            }
        }
        System.out.println(input);
    }
}