#include<stdio.h>
typedef long long int lli;
#define MAX 1000000

int* isPrime;
int *nPrime;
void sieve()
{
    isPrime=(int*)malloc(sizeof(int)*MAX);
    nPrime=(int*)malloc(sizeof(int)*MAX);
    
    memset(isPrime,1,sizeof(int)*MAX);
    memset(nPrime,0,sizeof(int)*MAX);
    isPrime[0]=0;
    isPrime[1]=0;
    nPrime[0]=0;
    nPrime[1]=0;
    for(long long int i=4;i<MAX;i=i+2)
    {
    	isPrime[i]=0;
	}
    for(unsigned long long int i=3;i<sqrt(MAX);i=i+2)
	{
		if(isPrime[i])
		{
			for(unsigned long long j=i*i;j<=MAX;j+=i)
			{
				isPrime[j]=0;
			}
		}
	}
	for(unsigned long long int i=2;i<MAX;i++)
	{
	    if(isPrime[i])
	    {
	        nPrime[i]=1;
	        
		}
		
		nPrime[i]+=nPrime[i-1];
	}
}
main()
{
    sieve();
    lli Q,L,R,high,low,count=0;
    scanf("%lld",&Q);
    while(Q--)
    {
        scanf("%lld%lld",&L,&R);
        if(L<R){
            low=L;
            high=R;
        }
        else
        {
            low=R;high=L;
        }
        count=0;
        // for(lli i=low;i<=high;i++)
        // {
        //     if(isPrime[i])
        //         count++;
        // }
        // printf("%lld\n",count);
//        
        printf("%lld\n",nPrime[high]-nPrime[low]);
        
    }
    
}
