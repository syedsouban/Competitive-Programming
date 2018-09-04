import java.io.*;
import java.util.*;
public class GFGMinCostPath
{
    static int minCost(int costs[][], int m, int n)
    {
        if(m<0||n<0)
            return 1000;
        else if(m==0&&n==0)
            return costs[m][n];
        else
        {
            return costs[m][n]+Math.min(minCost(costs,m-1,n),Math.min(minCost(costs,m,n-1),minCost(costs,m-1,n-1)));
        }
    }
    public static void main(String args[]) throws IOException
    {
        int costs[][] ={{1,3,2},{4,8,2},{1,5,3}};
        System.out.println(minCost(costs,2,2));
    }
}