#include<stdio.h>
#define MAX 1000000007
long long int binaryExponentiation(long long int x,long long int n,long long int M)
{
	if(n==0)
	{
		return 1;
	}
	if(n%2==0)
	{
		return binaryExponentiation((x*x)%M,n/2,M);
	}
	else
	{
		return ((x)*binaryExponentiation((x*x)%M,(n-1)/2,M))%M;
	}
}

smallest(int a[],int n)
{
	int min=a[0];
	for(int i=0;i<n;i++)
	{
		if(a[i]<min)
			min=a[i];
	}
	return min;
}
largest(int a[],int n)
{
	int max=a[0];
	for(int i=0;i<n;i++)
	{
		if(a[i]>max)
			max=a[i];
	}
	return max;
}
main()
{
	int n;
	scanf("%d",&n);
	int a[n],f[100];
	for(int i=0;i<n;i++)
		scanf("%d",&a[i]);
	int min=smallest(a,n);
	int flag=0;
	int m=0;
	for(int j=2;j<=min;j++)
			{ flag=0;	
				if(min%j==0)
				{
					if(min/j==j)
					{
//						sum+=j;
//						count++;
//						min=min/j;
//						printf("%d ",j);	
						flag=0;
						for(int i=0;i<n;i++)
						{
							if(a[i]%j!=0)
								{
									flag=1;
									break;
								}
						}
						if(flag==0)
							f[m++]=j;
					
					}	
					else{
//						count++;
//							printf("%d %d ",j,min/j);
							flag=0;
							for(int i=0;i<n;i++)
						{
							if(a[i]%j!=0)
								{
									flag=1;
									break;
								}			
						}
						if(flag==0)
							f[m++]=j;
							flag=0;
						for(int i=0;i<n;i++)
						{
							if(a[i]%(min/j)!=0)
								{
									flag=1;
									break;
								}
								
						}
						if(flag==0)
							f[m++]=min/j;
//						sum=sum+j+v[i]/j;
//						cout<<sum<<"sum";
//						cout<<j<<"j";
					}
					
				}		
			}
			printf("%d",largest(f,m));
			long long int pro=1;
			for(int i=0;i<n;i++)
			{
				pro=(pro*a[i])%MAX;
			}
			printf(" %lld",pro);
			
//			printf("%lld",binaryExponentiation(largest(f,m),pro,MAX));
}
