import java.io.*;
import java.util.*;
class Graph
    {
        int n;
        LinkedList<Integer> adjList[];
        public Graph(int n)
        {
            this.n=n;
            adjList=new LinkedList[n];
            for(int i=0;i<n;i++)
            {
                adjList[i]=new LinkedList<Integer>();
            }
        }
        void addEdge(int a,int b)
        {
            adjList[a].add(b);
            adjList[b].add(a);
        }
        void printAdjList()
        {
            for(int i=0;i<n;i++)
            {
                for(int j:adjList[i])
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }            
        }
        void BFS(int s)
        {
            Queue<Integer> queue = new LinkedList<Integer>();
            queue.add(s);
            boolean[] visited = new boolean[n];
            for(int i=0;i<n;i++)
                visited[i]=false;
            visited[s]=true;
            int w;
            while(!(queue.isEmpty()))
            {
                w=queue.remove();
                System.out.print(w+" ");
                for(int c:adjList[w])
                {
                    if(!(visited[c]))
                        queue.add(c);
                }
                visited[w]=true;
            }
        }
        void DFS(int s)
        {
            LinkedList<Integer> stack = new LinkedList<Integer>();
            stack.push(s);
            boolean[] visited = new boolean[n];
            for(int i=0;i<n;i++)
                visited[i]=false;
            visited[s]=true;
            int w;
            System.out.println();
            while(!(stack.isEmpty()))
            {
                w=stack.pop();
                System.out.print(w+" ");
                for(int c:adjList[w])
                {
                    if(!(visited[c]))
                        stack.push(c);
                }
                visited[w]=true;
            }
        }
    }
public class GraphClass
{
    public static void main(String args[])
    {
        Graph graph=new Graph(10);
        graph.addEdge(1,2);
        graph.addEdge(3,4);
        graph.addEdge(1,4);
        graph.addEdge(1,9);
        graph.addEdge(4,5);
        graph.addEdge(3,6);
        graph.addEdge(7,8);
        graph.addEdge(7,0);
        graph.addEdge(0,4);
        graph.printAdjList();
        graph.BFS(0);
        graph.DFS(0);
    }
    
}