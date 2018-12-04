import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
class MCO16404_alternate 
{
    static class Scanner
    {
        BufferedReader br;
        StringTokenizer tk=new StringTokenizer("");
        public Scanner(InputStream is) 
        {
            br=new BufferedReader(new InputStreamReader(is));
        }
        public int nextInt() throws IOException
        {
            if(tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextInt();
        }
        public long nextLong() throws IOException
        {
            if(tk.hasMoreTokens())
                return Long.parseLong(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextLong();
        }
        public String next() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return next();
        }
        public String nextLine() throws IOException
        {
            tk=new StringTokenizer("");
            return br.readLine();
        }
        public double nextDouble() throws IOException
        {
            if(tk.hasMoreTokens())
                return Double.parseDouble(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextDouble();
        }
        public char nextChar() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken().charAt(0));
            tk=new StringTokenizer(br.readLine());
            return nextChar();
        }
        public int[] nextIntArray(int n) throws IOException
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArray(int n) throws IOException
        {
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=nextLong();
            return a;
        }
        public int[] nextIntArrayOneBased(int n) throws IOException
        {
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArrayOneBased(int n) throws IOException
        {
            long a[]=new long[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextLong();
            return a;
        }
    
    
    }
    static class Trie
    {
        int left[],right[],N;
        Trie()
        {
            left=new int[100000000];
            right=new int[100000000];
            N=0;
        }
        int createNode()
        {
            N++;
            return N;
        }
        int newTrie()
        {
            return createNode();
        }
        void insert(int node,int value)
        {
            int mask=1<<20;
            while(mask>0)
            {
                if((value&mask)>0)
                {
                    if(right[node]==0)
                        right[node]=createNode();
                    node=right[node];
                }
                else
                {
                    if(left[node]==0)
                        left[node]=createNode();
                    node=left[node];
                }
                mask>>=1;
            }
        }
        int query(int node,int value)
        {
            int mask=1<<20;
            int ans=0;
            while(mask>0)
            {
                if((value&mask)>0)
                {
                    if(left[node]!=0)
                    {
                        ans+=mask;
                        node=left[node];
                    }
                    else
                        node=right[node];
                }
                else
                {
                    if(right[node]!=0)
                    {
                        ans+=mask;
                        node=right[node];
                    }
                    else
                        node=left[node];
                }
                mask>>=1;
            }
            return ans;
        }
    }
    static class SegmentTree
    {
        int n;
        int tree[],start[],end[];
        Trie t;
        SegmentTree(int a[])
        {
            t=new Trie();
            n=a.length-1;
            tree=new int[4*n+100];
            start=new int[4*n+100];
            end=new int[4*n+100];
            build(1,1,n,a);
        }
        void build(int node,int s,int e,int a[])
        {
            start[node]=s;
            end[node]=e;
            tree[node]=t.newTrie();
            for(int i=s;i<=e;i++)
                t.insert(tree[node], a[i]);
            if(s==e)
            {
                return;
            }
            int mid=(s+e)/2;
            build(2*node,s,mid,a);
            build(2*node+1,mid+1,e,a);
        }
        int query(int l,int r,int value)
        {
            return query(1,l,r,value);
        }
        int query(int node,int l,int r,int value)
        {
            if(r<start[node]||l>end[node])
                return 0;
            else if(l<=start[node]&&r>=end[node])
                return t.query(tree[node], value);
            else
            {
                int leftValue=query(2*node,l,r,value);
                int rightValue=query(2*node+1,l,r,value);
                return Math.max(leftValue,rightValue);
            }
        }
    }
    public static void main(String args[]) throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        int a[]=in.nextIntArrayOneBased(n);
        SegmentTree st=new SegmentTree(a);
        int q=in.nextInt();
        while(q--!=0)
            out.println(st.query(in.nextInt(), in.nextInt(), in.nextInt()));
        out.close();
    }

}
