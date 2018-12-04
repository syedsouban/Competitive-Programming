#include<stdio.h>
#include<math.h>
#include<stdlib.h>
typedef struct Point
{
	int x,y;
} Point;
float mini(float x,float y)
{
	if(x<y)
	return x;
	
	return y;
}
int comparatorY(const void* a,const void *b)
{
	return ( ((*(Point*)a).y)-((*(Point*)b).y) );
}
int comparatorX(const void* a,const void *b)
{
	return ( ((*(Point*)a).x)-((*(Point*)b).x) );
}
float distance(Point P,Point Q)
{
	return sqrt((P.x-Q.x)*(P.x-Q.x)+(P.y-Q.y)*(P.y-Q.y));
}
float distance3(Point A,Point B,Point C)
{
	float a=distance(A,B);
	float b=distance(B,C);
	float c=distance(C,A);
	if(a>b&&a>c)
	return a;
	else if(b>c)
	return b;
	else return c;
}
float shortestDistance(int s,int e,Point* points,float min)
{
	if(e-s+1<=3)
	{
		if(e-s+1==3)
		{
		printf(" %f ",distance3(points[s],points[s+1],points[s+2]));
		return distance3(points[s],points[s+1],points[s+2]);
	}
		if(e-s+1==2)
	{
		printf(" %f ",distance(points[e],points[s]));
			return distance(points[e],points[s]);
	}
	if(e==s)
	{
		printf("\nsingle point passed to fun returning 9999");
		return 9999;
	}
	
	
	
	}
	float d1=shortestDistance(s,e/2,points,min);
	float d2=shortestDistance(e/2+1,e,points,min);
	float min1=mini(d1,d2);
	return mini(min,min1);
}
float ClosestDistance(Point *points,float d,int n)
{
	Point subsetPoints[n];
	int Xm=(points[n/2]).x;
	printf("\nXm=%d",Xm);
	int m=0;
	for(int i=0;i<n;i++)
	{
		if(abs((points[i].x)-Xm)<d)
		{
			subsetPoints[m++]=points[i];
		}
	}
	
	qsort(subsetPoints,m,sizeof(points[0]),comparatorY);
	printf("\nsorted");
//	int m=sizeof(subsetPoints)/sizeof(points[0]);
	printf("\nm=%d",m);
	float dist=0;
	for(int i=0;i<m;i++)
	{
		for(int j=i+1;j<m&&(abs(subsetPoints[j].y-subsetPoints[i].y)<d);j++)
		{
			dist=distance(subsetPoints[i],subsetPoints[j]);
			if(dist<d)
				d=dist;
		}
		printf("\n%dth iteration",i);
	}
	return d;
}
int main()
{	
Point points[]={{1,1},{0, 0},{9,3},{2,2},{5,5}};
int n=sizeof(points)/sizeof(Point);
qsort(points,n,sizeof(points[0]),comparatorX); 
//	printf("%f",distance(points[0],points[1]));
	
	
	float d1=shortestDistance(0,n/2,points,9999);
	float d2=shortestDistance(n/2+1,n-1,points,9999);
	float d=mini(d1,d2);
	printf("%f",ClosestDistance(points,d,n));
//	printf(" %f ",d);
	return 0;
}
