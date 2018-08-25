#include<stdio.h>
typedef long long int lli;
lli binaryExponentiation(lli x,lli n,lli M)
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

main()
{
	printf("%ld",binaryExponentiation(127,34,23));
}
