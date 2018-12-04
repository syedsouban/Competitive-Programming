import java.util.*;
public class tests
{
    public static void main(String args[])
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
//        int b[]=new int[100];
        Integer a[]=al.toArray(new Integer[10]);
        System.out.println(a[0]);
        
        List<List<Integer>> list = new ArrayList<>();
        list.add(al);
        al=new ArrayList<>();
        al.add(3);
        al.add(4);
        list.add(al);
        al=new ArrayList<>();
        al.add(5);
        al.add(6);
        list.add(al);
        al=new ArrayList<>();
        al.add(3);
        al.add(12);
        list.add(al);
         al=new ArrayList<>();
        al.add(13);
        al.add(41);
        list.add(al);
        int[][] b=new int[5][2];
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<2;j++)
                b[i][j]=(list.get(i)).get(j);
        }
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<2;j++)
                System.out.println(b[i][j]);
        }
    }
}