#include<iostream>
#include<math.h>
using namespace std;
main()
{
	unsigned long long N;
	cin>>N;
	bool isPrime[N];
	for(unsigned long long i=0;i<N;i++)
	{
		isPrime[i]=true;
	}
	isPrime[0]=false;
	isPrime[1]=false;
	for(unsigned long long i=2;i<sqrt(N);i++)
	{
		if(isPrime[i])
		{
			for(unsigned long long j=i*i;j<=N;j+=i)
			{
				isPrime[j]=false;
			}
		}
	}
	for(unsigned long long i=2;i<N;i++)
	{
		if(isPrime[i])
		{
			cout<<i<<" ";
		}
	}	
}
