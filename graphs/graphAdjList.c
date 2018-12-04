#include<stdio.h>
struct node
	{
		int val;
		struct node* next;
	};
	struct Graph
	{
		int n;
		struct node** adjList;
	};
	struct node* createNode(int v)
	{
		struct node* newNode=malloc(sizeof(struct node));
		newNode->val=v;
		newNode->next=NULL;
		return newNode;
	}
	struct Graph* createGraph(int v)
	{
		struct Graph* graph=malloc((sizeof(struct Graph)));
		graph->n=v;
		graph->adjList=malloc(v*sizeof(struct node*));
		for(int i=0;i<v;i++)
		{
			graph->adjList[i]=NULL;
		}
		return graph;
	}
	void addEdge(struct Graph* graph,int src,int dest)
	{
		struct node* destnode=createNode(dest);
		destnode->next=graph->adjList[src];
		graph->adjList[src]=destnode;
		
		struct node* srcnode=createNode(src);
		srcnode->next=graph->adjList[dest];
		graph->adjList[dest]=srcnode;
	}
	void printGraph(struct Graph* graph)
	{
	    int v;
	    for (v = 0; v < graph->n; v++)
	    {
	        struct node* temp = graph->adjList[v];
	        printf("\n Adjacency list of vertex %d\n ", v);
	        while (temp)
	        {
	            printf("%d -> ", temp->val);
	            temp = temp->next;
	        }
	        printf("\n");
	    }
	}
main()
{
	struct Graph* graph=createGraph(5);
	addEdge(graph,0,1);
	addEdge(graph,1,2);
	addEdge(graph,2,3);
	addEdge(graph,3,4);
	addEdge(graph,4,0);
		
	printGraph(graph);
}
