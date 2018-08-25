
#include<stdio.h>
#include<math.h>
#define M_PI 3.14159
int main()
{
	int v1,r1,v2,r2,n;
	scanf("%d%d%d%d%d",&v1,&r1,&v2,&r2,&n);
	int a1,a2;
	float d,d1,d2;
	a1=(v1*n)%360;
	a2=(v2*n)%360;
	d1=(a1*M_PI)/180;
	d2=(a2*M_PI)/180;
	float x=(r1*cos(d1)-r2*cos(d2));
	
	float y=(r1*sin(d1)-r2*sin(d2));
	d=sqrt(x*x+y*y);
	printf("%.2f",(d));
	return 0;
}
