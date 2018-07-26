#include<stdio.h>
#define MAX 1000000
typedef long long int lli;
int* isPrime;
void sieve()
{
    memset(isPrime,1,sizeof(int)*MAX);
    isPrime[0]=0;
    isPrime[1]=0;
    for(unsigned long long i=2;i<sqrt(MAX);i++)
	{
		if(isPrime[i])
		{
			for(unsigned long long j=2*i;j<=MAX;j+=i)
			{
				isPrime[j]=0;
			}
		}
	}
}
main()
{
isPrime=(int*)malloc(sizeof(int)*MAX);	
int* v=(int*)malloc(sizeof(int)*MAX);
int count;
sieve();
for(long long int i=1;i<MAX;i++)
{
	count=0;
	if(isPrime[i])
		*(v+i)=2;
	else
	{
		
for(long long int j=2;j<=sqrt(MAX);j++)
			{	
				if(i%j==0)
				{
					
					if(i/j==j)
					{
				// 		sum+=j;
						count++;
//						n=n/j;
				// 		cout<<j<<" ";
					}
						else
						{
							
						count++;
				// 			cout<<j<<" "<<v[i]/j<<" ";
//						sum=sum+j+v[i]/j;
//						cout<<sum<<"sum";
//						cout<<j<<"j";
					}
				}		
			}
			*(v+i)=count+1;
		}
			}
			
			for(long long int i=1;i<1000;i++)
			{
				printf("%lld,%lld ",i,*(v+i));
			}
		
}
